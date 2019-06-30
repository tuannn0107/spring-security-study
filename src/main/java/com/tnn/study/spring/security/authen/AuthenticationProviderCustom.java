package com.tnn.study.spring.security.authen;

import com.tnn.study.spring.security.model.ApplicationUser;
import com.tnn.study.spring.security.service.ApplicationAuthenticationService;
import com.tnn.study.spring.security.service.ApplicationUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class AuthenticationProviderCustom implements AuthenticationProvider {
    private static Logger logger = LoggerFactory.getLogger(AuthenticationProviderCustom.class);

    /*@Autowired
    private ApplicationAuthenticationService applicationAuthenticationService;

    @Autowired
    private ApplicationUserService applicationUserService;*/

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        logger.info("Start authenticate!");
        ApplicationUser applicationUser = obtainApplicationUser(authentication);
        return new AuthenticationCustom(applicationUser.getUsername(),
                applicationUser.getPassword(),
                applicationUser.getAuthorities(),
                true,
                "User " + applicationUser.getUsername());
        /*if (applicationUser == null) {
            throw new BadCredentialsException("Could not obtain ApplicationUser");
        }

        try {
            boolean doAuthen = applicationAuthenticationService.authenticate(applicationUser);
            if (doAuthen)
            {
                applicationUser = applicationUserService.readApplicationUser(applicationUser.getUsername());
                return new AuthenticationCustom(applicationUser.getUsername(),
                        applicationUser.getPassword(),
                        applicationUser.getAuthorities(),
                        true,
                        "User " + applicationUser.getUsername());
            }
        } catch (UserPrincipalNotFoundException e) {
            throw new BadCredentialsException(e.getMessage());
        }
        throw new AuthenticationCredentialsNotFoundException("Authentication failed!");*/
    }


    /**
     * obtain authentication user
     *
     * @param authentication
     * @return
     */
    private ApplicationUser obtainApplicationUser(Authentication authentication) {
        return new ApplicationUser(authentication.getPrincipal().toString(), authentication.getCredentials().toString(), null);
    }


    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
