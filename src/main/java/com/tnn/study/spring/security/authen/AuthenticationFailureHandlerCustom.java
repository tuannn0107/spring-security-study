package com.tnn.study.spring.security.authen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationFailureHandlerCustom implements AuthenticationFailureHandler {
    private static Logger logger = LoggerFactory.getLogger(AuthenticationFailureHandlerCustom.class);

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        logger.info("Start handle authentication fail!");
        response.sendError(HttpStatus.UNAUTHORIZED.value(), "Authentication failed!!");
    }
}
