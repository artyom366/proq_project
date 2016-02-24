//package lv.proq.ui.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
//
//import javax.sql.DataSource;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Marina on 2/22/2016.
// */
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//
//        JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager();
//        userDetailsManager.setDataSource(dataSource);
//
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//
//        auth.userDetailsService(userDetailsManager).passwordEncoder(bCryptPasswordEncoder);
//        auth.jdbcAuthentication().dataSource(dataSource);
//
//        if (!userDetailsManager.userExists("user")) {
//            List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
//            authorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
//
//            User user = new User("user", bCryptPasswordEncoder.encode("pass"), authorityList);
//            userDetailsManager.createUser(user);
//        }
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/test").permitAll()
//                .antMatchers("/user/**").access("hasRole('ROLE_USER')")
//                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
//                .antMatchers("/**").fullyAuthenticated()
//                .and()
//                .exceptionHandling()
//                .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/"));
//    }
//
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//}
