package com.paravar;

import jakarta.validation.constraints.NotNull;
import org.springframework.security.core.GrantedAuthority;

public record CustomGrantedAuthority(String scope, String authority) implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return scope + ":" + authority;
    }

    @Override
    public String toString() {
        return getAuthority();
    }
}