package com.todeb.rnaylmz.creditapplicationsystem.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    @Configuration
    @EnableSwagger2
    @EnableWebMvc
    public class SwaggerConfig {

        public static final String AUTHORIZATION_HEADER = "Authorization";

        @Bean
        public Docket customDocket() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .securityContexts(Arrays.asList(securityContext()))
                    .securitySchemes(Arrays.asList(apiKey()))
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.todeb.rnaylmz.creditapplicationsystem"))
                    .build();
        }


        private ApiKey apiKey() {
            return new ApiKey("JWT", "Authorization", "header");
        }

        private ApiInfo apiInfo() {
            return new ApiInfo(
                    "Credit Application System",
                    "Final Project",
                    "1",
                    "Terms of service",
                    new Contact("Rana Yılmaz", "https://github.com/rnarylmz", "rnaryhn@gmail.com"),
                    "License of API",
                    "API license URL",
                    Collections.emptyList()
            );
        }


        private SecurityContext securityContext() {
            return SecurityContext.builder().securityReferences(defaultAuth()).build();
        }

        private List<SecurityReference> defaultAuth() {
            AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
            AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
            authorizationScopes[0] = authorizationScope;
            return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
        }


    }

