/**
 * 
 */
package com.sapient.weatherforecast.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * @author indiahiring
 *
 */
@EnableWebMvc
public class WebResolverConfiguration extends WebMvcConfigurerAdapter {

	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	        super.addResourceHandlers(registry);
	    }

	    @Bean
	    public ViewResolver viewResolver() {
	       UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
	        viewResolver.setViewClass(InternalResourceView.class);
	        return viewResolver;
	    }

}
