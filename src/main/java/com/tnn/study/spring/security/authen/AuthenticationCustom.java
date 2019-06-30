package com.tnn.study.spring.security.authen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Principal;
import java.util.Collection;

public class AuthenticationCustom implements Authentication {
    private static Logger logger = LoggerFactory.getLogger(AuthenticationCustom.class);

    private Object principal;
    private Object credentials;
    private Collection<GrantedAuthority> authorities;
    private Object details;
    private boolean authenticated = false;
    private String fullname;

    public AuthenticationCustom(Object principal, Object credentials,
                                Collection<GrantedAuthority> authorities) {
        this.principal = principal;
        this.credentials = credentials;
        this.authorities = authorities;
        this.authenticated = false;
        this.fullname = "";
    }

    public AuthenticationCustom(Object principal, Object credentials,
                                Collection<GrantedAuthority> authorities,
                                boolean authenticated,
                                String fullname) {
        this.principal = principal;
        this.credentials = credentials;
        this.authorities = authorities;
        this.authenticated = authenticated;
        this.fullname = fullname;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public Object getCredentials() {
        return this.credentials;
    }

    @Override
    public Object getDetails() {
        return this.details;
    }

    @Override
    public Object getPrincipal() {
        return this.principal;
    }

    @Override
    public boolean isAuthenticated() {
        return this.authenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

    }

    @Override
    public String getName() {
        if (this.getPrincipal() instanceof UserDetails) {
            return ((UserDetails) this.getPrincipal()).getUsername();
        }
        if (this.getPrincipal() instanceof AuthenticatedPrincipal) {
            return ((AuthenticatedPrincipal) this.getPrincipal()).getName();
        }
        if (this.getPrincipal() instanceof Principal) {
            return ((Principal) this.getPrincipal()).getName();
        }

        return (this.getPrincipal() == null) ? "" : this.getPrincipal().toString();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
