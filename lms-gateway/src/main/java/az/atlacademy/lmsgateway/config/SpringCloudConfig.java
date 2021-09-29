package az.atlacademy.lmsgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

        return builder.routes()
                .route(rt -> rt.path("/lesson-ms/**")
                        .filters(f->())
                        .uri("http://localhost:9901"))
                .route(rt -> rt.path("/student-ms/**")
                        .uri("http://localhost:9900"))
                .route(rt -> rt.path("/auth-ms/**")
                        .uri("http://localhost:8060"))
                .build();

    }
}

