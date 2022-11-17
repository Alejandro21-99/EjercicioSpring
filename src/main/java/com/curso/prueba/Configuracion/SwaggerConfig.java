package com.curso.prueba.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {


        private ApiInfo apiInfo(){
            return  new ApiInfoBuilder()
                    .title("Api Ejercicio 2")
                    .description("Api")
                    .build();
        }

        @Bean
        public Docket api(){
            return new Docket(DocumentationType.OAS_30).select()
                    .apis(RequestHandlerSelectors.basePackage("com.curso.prueba.vista"))
                    .paths(PathSelectors.any()).build();

        }

}