package com.gmail.renish.ecommerce.dto.auth;

import com.gmail.renish.ecommerce.dto.user.UserResponse;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private UserResponse user;
    private String token;
}
