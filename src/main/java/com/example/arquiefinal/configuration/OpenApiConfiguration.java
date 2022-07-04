package com.example.arquiefinal.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean(name = "HotelOpenApi")
    public OpenAPI hotelOpenAPI(){
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Hotel Microservice - API")
                        .description("Hotel Microservice pertenece al sistema de seguimiento y documentacion de viajes, fue implementado con Spring boot RESTful service y documentado con spingdoc_openapi y OpenAPI 3.0 "));
    }
}
