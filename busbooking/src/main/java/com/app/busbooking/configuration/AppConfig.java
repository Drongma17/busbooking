package com.app.busbooking.configuration;

import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app.busbooking")
public class AppConfig  extends WebMvcConfigurerAdapter {
	
	/*
	 * convert db data to jason format
	 */
	public MappingJackson2HttpMessageConverter jacksonMessageConverter(){
	    MappingJackson2HttpMessageConverter messageConverter = new  MappingJackson2HttpMessageConverter();

	    ObjectMapper mapper = new ObjectMapper();
	    //Registering Hibernate4Module to support lazy objects
	    mapper.registerModule(new Hibernate4Module());

	    messageConverter.setObjectMapper(mapper);
	    return messageConverter;

	}

	
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	    //Here we add our custom-configured HttpMessageConverter
	    converters.add(jacksonMessageConverter());
	    super.configureMessageConverters(converters);
	
	}
	
	
	
	/*
     * Configure View Resolver
     */
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
	
	  /*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     *
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        
        
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
  
         registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
 
	
	
	 /*
     * Configure MessageSource to provide internationalized messages
     *
     */
	
	@Bean
	public MessageSource messageSource() {
	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.setBasename("messages");
	    return messageSource;
	}
	
	
		
	
}// end class

