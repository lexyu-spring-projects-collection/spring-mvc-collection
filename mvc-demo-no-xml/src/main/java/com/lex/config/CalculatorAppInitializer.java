package com.lex.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author : LEX_YU
 * @date : 2023/4/2
 * Approach 1
 */
public class CalculatorAppInitializer // implements WebApplicationInitializer
{
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("My custom class onstartup method called >>> Lex");

        // Java Based
        AnnotationConfigWebApplicationContext webApplicationContext =
                new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(CalculatorAppConfig.class);

        /* XML Based
        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
        webApplicationContext.setConfigLocation("classpath:application-config.xml");
         */

        // create a dispatcher servlet object
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);


        // register the dispatcher servlet with the servlet context object
        ServletRegistration.Dynamic myCustomDispatcherServlet =
                servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
        myCustomDispatcherServlet.setLoadOnStartup(1);
        myCustomDispatcherServlet.addMapping("/home/*");
    }
}
