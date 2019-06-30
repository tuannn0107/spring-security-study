package com.tnn.study.spring.security.service;

import com.tnn.study.spring.security.model.ApplicationUser;
import com.tnn.study.spring.security.repository.ApplicationUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService {
    private static Logger logger = LoggerFactory.getLogger(ApplicationUserServiceImpl.class);

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    /**
     * {@link ApplicationUserService#readApplicationUserList()}
     */
    @Override
    public List<ApplicationUser> readApplicationUserList() {
        logger.info("Start readApplicationUserList.");
        return applicationUserRepository.readApplicationUserList();
    }

    /**
     * {@link ApplicationUserService#readApplicationUser(String)}
     */
    @Override
    public ApplicationUser readApplicationUser(String username) {
        logger.info("Start readApplicationUser");
        return applicationUserRepository.readApplicationUser(username);
    }
}
