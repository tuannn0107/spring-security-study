package com.tnn.study.spring.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class ApplicationUser extends User {


    public ApplicationUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public ApplicationUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    @Override
    public boolean equals(Object rhs) {
        ApplicationUser other = (ApplicationUser) rhs;
        return this.getUsername().equals(other.getUsername())
                && this.getPassword().equals(other.getPassword())
                && this.getAuthorities().equals(other.getAuthorities());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
