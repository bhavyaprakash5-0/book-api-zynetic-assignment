package com.shop.book_shop_bhavyaPrakash.controller;

import com.shop.book_shop_bhavyaPrakash.dto.LoginRequest;
import com.shop.book_shop_bhavyaPrakash.dto.SignupRequest;
import com.shop.book_shop_bhavyaPrakash.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody SignupRequest request) {
        userService.registerUser(request);
        return ResponseEntity.ok("User registered successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequest request) {
        String token = userService.loginUser(request);
        return ResponseEntity.ok(token);
    }
}
