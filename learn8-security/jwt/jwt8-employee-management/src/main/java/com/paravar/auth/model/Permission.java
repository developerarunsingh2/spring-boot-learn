package com.paravar.auth.model;

import org.springframework.security.core.GrantedAuthority;

public record Permission(String scope, String authority) implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return scope + ":" + authority;
    }

    @Override
    public String toString() {
        return getAuthority();
    }
}