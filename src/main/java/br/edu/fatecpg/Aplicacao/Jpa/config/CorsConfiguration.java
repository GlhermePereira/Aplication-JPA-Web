package br.edu.fatecpg.Aplicacao.Jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
public void addCorsMappings(CorsRegistry registry) {
    //Faz com que so sejam aceitas requisicoes pelo http adicionado
                    registry.addMapping("/**").allowedOrigins("http://127.0.0.1");

            }
}
