package com.example.blog_platform_api.dto;

public record JwtResponse(String token, String username, String role) {}