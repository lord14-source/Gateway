//package com.Gateway.Gateway.Authentication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
//
//    @Autowired
//    private AuthenticationFilter authenticationFilter;
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("otp-service", r -> r.path("/OTP/**")
//                        .filters(f -> f.filter(authenticationFilter))
//                        .uri("http://localhost:8087"))
//                .route("aadhaar-service", r -> r.path("/AddharService/**")
//                        .filters(f -> f.filter(authenticationFilter))
//                        .uri("http://localhost:8086"))
//                .route("mobile-service", r -> r.path("/Registraion/**")
//                        .filters(f -> f.filter(authenticationFilter))
//                        .uri("http://localhost:8085"))
//                .build();
//    }
//}
