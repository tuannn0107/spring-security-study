package com.tnn.study.spring.security.repository;

import com.tnn.study.spring.security.model.ApplicationUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class ApplicationUserRepositoryImpl implements ApplicationUserRepository {
    private static List<ApplicationUser> applicationUsersList = new ArrayList<>();

    /**
     * mock application user list
     */
    @PostConstruct
    private void init()
    {
        applicationUsersList = mockApplicationUserList();
    }

    /**
     * {@link ApplicationUserRepository#readApplicationUserList()}
     */
    @Override
    public List<ApplicationUser> readApplicationUserList() {
        return null;
    }


    /**
     * {@link ApplicationUserRepository#readApplicationUser(String)}
     */
    @Override
    public ApplicationUser readApplicationUser(String username) {
        for (ApplicationUser applicationUser : applicationUsersList) {
            if (applicationUser.getUsername().equals(username))
            {
                return applicationUser;
            }
        }
        return null;
    }


    /**
     * mock application user list
     *
     * @return {@link List<ApplicationUser>}
     */
    private List<ApplicationUser> mockApplicationUserList() {
        List<ApplicationUser> res = new ArrayList<>();

        ApplicationUser applicationUser = null;
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("admin"));

        for (long i = 0; i < 10; i++) {
            applicationUser = new ApplicationUser("username" + i, "password" + 1, true, true, true, true,grantedAuthorities);
            res.add(applicationUser);
        }
        return res;
    }
}
