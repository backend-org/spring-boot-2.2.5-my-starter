package org.example.config;


import org.example.beans.IncomeService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LoanProperties.class)
public class MainConfiguration {
    @Bean
    public IncomeService incomeService() {
        return new IncomeService();
    }
}
