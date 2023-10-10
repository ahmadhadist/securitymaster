package com.medium.service;

import com.medium.dao.request.SignInRequest;
import com.medium.dao.request.SignUpRequest;
import com.medium.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
