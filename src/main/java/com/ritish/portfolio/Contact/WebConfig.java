package com.ritish.portfolio.Contact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class WebConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // Allow cookies and credentials
        config.addAllowedOriginPattern("http://localhost:5173"); // Allow specific origin
        config.addAllowedHeader("*"); // Allow any header
        config.addAllowedMethod("*"); // Allow any method (GET, POST, etc.)
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
