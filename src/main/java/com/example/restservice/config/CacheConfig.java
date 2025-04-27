package com.example.restservice.config;

import com.example.restservice.model.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CacheConfig {

    @Bean
    public Map<String, List<Product>> productsByUsernameCache() {
        return new HashMap<>();
    }
}
