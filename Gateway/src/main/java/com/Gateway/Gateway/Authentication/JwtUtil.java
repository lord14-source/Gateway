//package com.Gateway.Gateway.Authentication;
//
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JwtUtil {
//    private static final String SECRET_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6";
//
//    public Claims extractClaims(String token) {
//        System.out.println("Cliaims");
//        return Jwts.parserBuilder()
//                .setSigningKey(SECRET_KEY.getBytes())
//                .build()
//                .parseClaimsJws(token)
//                .getBody();
//    }
//
//    public boolean isTokenValid(String token) {
//        try {
//            System.out.println("here");
//            extractClaims(token);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
