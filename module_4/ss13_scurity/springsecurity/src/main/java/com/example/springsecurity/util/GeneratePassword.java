package com.example.springsecurity.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
    public static String generatePassword(String rawPass) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(rawPass);
    }

    public static void main(String[] args) {
        System.out.println(generatePassword("123456"));
    }
}
