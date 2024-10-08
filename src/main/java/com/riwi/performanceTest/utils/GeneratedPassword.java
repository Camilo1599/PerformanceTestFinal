package com.riwi.performanceTest.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "samuel2006"; // Cambia esto por la contraseña deseada
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}