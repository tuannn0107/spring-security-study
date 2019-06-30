package com.tnn.study.spring.security.service;

import com.tnn.study.spring.security.authen.LogoutSuccessHandlerCustom;
import com.tnn.study.spring.security.model.ApplicationUser;
import com.tnn.study.spring.security.repository.ApplicationUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Service
public class ApplicationAuthenticationServiceImpl implements ApplicationAuthenticationService {
    private static Logger logger = LoggerFactory.getLogger(ApplicationAuthenticationServiceImpl.class);

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @Override
    public boolean authenticate(ApplicationUser applicationUser) throws UserPrincipalNotFoundException {
        logger.info("Start do authenticate.");
        ApplicationUser applUser = applicationUserRepository.readApplicationUser(applicationUser.getUsername());

        if (applUser == null)
        {
            throw new UserPrincipalNotFoundException("ApplicationUser not found!");
        }

        return applicationUser.getPassword().equals(applUser.getPassword());
    }
}
