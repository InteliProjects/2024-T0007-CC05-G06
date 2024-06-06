package br.edu.inteli.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuração para lidar com o Cross-Origin Resource Sharing (CORS).
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    /**
     * Adiciona configurações de CORS ao registro.
     * @param registry o registro de configurações CORS
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite acesso a partir de qualquer origem
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                .allowedHeaders("*"); // Todos os cabeçalhos permitidos
    }
}
