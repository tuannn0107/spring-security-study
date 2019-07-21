package com.tnn.study.spring.security.authen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutSuccessHandlerCustom implements LogoutSuccessHandler {
    private static Logger logger = LoggerFactory.getLogger(LogoutSuccessHandlerCustom.class);

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("Start handle logout success!");
        response.sendRedirect("loginAdmin");
        // Todo
    }
}
