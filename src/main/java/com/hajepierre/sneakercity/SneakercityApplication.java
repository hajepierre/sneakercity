package com.hajepierre.sneakercity;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SneakercityApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SneakercityApplication.class, args);
    }

    @Bean
    public LayoutDialect layoutDialect()
    {
        return new LayoutDialect();
    }

}
