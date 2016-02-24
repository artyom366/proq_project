package lv.proq.ui.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Marina on 2/21/2016.
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "lv.proq.ui")
public class DataSourceConfiguration {

    @Value("${spring.datasource.driverClassName}")
    private String databaseDriverClassName;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.username}")
    private String databaseUsername;

    @Value("${spring.datasource.password}")
    private String databasePassword;

    @Value("${spring.jpa.hibernate.dialect}")
    private String hibernateDialect;

    @Value("${spring.jpa.generate.ddl}")
    private Boolean generateDll;

    @Value("${spring.jpa.show.sql}")
    private Boolean showSql;

    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(databaseDriverClassName);
        driverManagerDataSource.setUrl(datasourceUrl);
        driverManagerDataSource.setUsername(databaseUsername);
        driverManagerDataSource.setPassword(databasePassword);
        return driverManagerDataSource;
    }

    //@Bean(name = "transactionManager") /*this transactionManager is used for hibernate DAO*/
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    //@Bean(name = "sessionFactory") /*this sessionFactory is used for hibernate DAO*/
    public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource) {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setHibernateProperties(hibernateProperties());
        localSessionFactoryBean.setPackagesToScan("lv.proq.ui.domain");
        return localSessionFactoryBean;
    }

    @Bean(name = "jpaVendor")
    public HibernateJpaVendorAdapter hibernateJpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(showSql);
        hibernateJpaVendorAdapter.setGenerateDdl(generateDll);
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
        return hibernateJpaVendorAdapter;
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource dataSource,
                                                                                         HibernateJpaVendorAdapter hibernateJpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean
                = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        localContainerEntityManagerFactoryBean.setPackagesToScan("lv.proq.ui.domain");
        return localContainerEntityManagerFactoryBean;
    }

    @Bean(name = "transactionManager")
    public JpaTransactionManager jpaTransactionManager() {
        return new JpaTransactionManager();
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", hibernateDialect);
        return properties;
    }
}
