package com.lex.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author : LEX_YU
 * @date : 2023/4/2
 * Approach 2
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        Class<?> arr[] = {CalculatorAppConfig.class};
        return arr;
    }

    protected String[] getServletMappings() {
        String arr[] = {"/"};
        return arr;
    }
}
