package com.tnn.study.spring.security.service;

import com.tnn.study.spring.security.model.ApplicationUser;

import javax.naming.AuthenticationException;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public interface ApplicationAuthenticationService {
    /**
     * do authen
     *
     * @return
     * @throws AuthenticationException
     * @throws UserPrincipalNotFoundException
     */
    boolean authenticate(ApplicationUser applicationUser) throws UserPrincipalNotFoundException;
}
