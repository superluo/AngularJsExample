package com.ahluo.app.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <pre>
 *  Jackson Utility
 * </pre>
 *
 * @author Ahluo on 2016-8-27.
 */
public class JsonUtil {
    public static <T> String getJson(T t) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(t);
        } catch (Exception e) {
            return null;
        }
    }
}
