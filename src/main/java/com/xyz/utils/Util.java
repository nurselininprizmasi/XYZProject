package com.xyz.utils;

import org.apache.commons.lang.ArrayUtils;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nursen on 26.02.2017.
 */
public class Util {

    public static Map<String, Object[]> getQueryParameters(HttpServletRequest request) {
        Map<String, Object[]> queryParameters = new HashMap<>();
        String queryString = request.getQueryString();

        if (StringUtils.isEmpty(queryString)) {
            return queryParameters;
        }

        String[] parameters = queryString.split("&");

        for (String parameter : parameters) {
            String[] keyValuePair = parameter.split("=");
            Object[] values = queryParameters.get(keyValuePair[0]);
            values = ArrayUtils.add(values, keyValuePair.length == 1 ? "" : keyValuePair[1]); //length is one if no value is available.
            queryParameters.put(keyValuePair[0], values);
        }
        return queryParameters;
    }

    public static String requestGet(Object[] value){

        if(value != null){
            return  value[0].toString();
        }
        else{
            return null;
        }

    }
}
