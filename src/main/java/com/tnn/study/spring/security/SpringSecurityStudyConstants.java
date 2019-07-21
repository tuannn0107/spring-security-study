package com.tnn.study.spring.security;

/**
 * The spring security study constants
 */
public interface SpringSecurityStudyConstants {
    /**
     * Define constants for views
     */
    interface ViewPath {
        String VIEW_PATH_SEPERATOR = "/";
        String ADMIN = "admin" + VIEW_PATH_SEPERATOR;
        String APPLICATION = "public" + VIEW_PATH_SEPERATOR;
    }
}
