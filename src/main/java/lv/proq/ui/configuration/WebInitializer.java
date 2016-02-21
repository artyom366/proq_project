package lv.proq.ui.configuration;


import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Artyom on 2/21/2016.
 */
@Order(value = 1)
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { WebConfiguration.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/"};
    }
}
