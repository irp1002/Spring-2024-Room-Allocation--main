package edu.sru.group7.roomallocation.secure;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class appConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){ 
            registry.addResourceHandler("/**")
                 .addResourceLocations("classpath:/static/")
                 .addResourceLocations("classpath:/static/listingImages")
                 .addResourceLocations("classpath:/static/images");
    }
}