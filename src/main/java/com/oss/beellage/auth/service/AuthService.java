package com.oss.beellage.auth.service;

import com.oss.beellage.auth.dto.EmailAuthRequest;
import com.oss.beellage.auth.dto.JoinRequest;

public interface AuthService {
    void validateEmail(EmailAuthRequest emailAuthRequest);

    void validateEmailCode(String email, String code);

    void validateNickname(String nickname);

    void register(JoinRequest joinRequest);
}
