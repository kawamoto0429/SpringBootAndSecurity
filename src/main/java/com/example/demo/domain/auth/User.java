package com.example.demo.domain.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

//Userモデル（Entity）
@Data
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private Authority authority;

    public enum Authority {
        ADMIN,
        USER,
    }
}
