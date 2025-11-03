package BackEnd.Portfolio.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    // Injecte une liste d'origines autorisées depuis application.properties
    // Séparées par des virgules (e.g., "http://localhost:8081,https://monportfolio.com")
    @Value("${allowed.origins}")
    private String[] allowedOrigins;

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/api/**") // Applique la politique CORS à tous les endpoints API
                .allowedOrigins(allowedOrigins) // Utilise les origines injectées
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}