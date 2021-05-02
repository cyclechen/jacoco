package me.cyclechen.demo.jacoco.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class IndexService {

    public String convertName(String name) {
        if (StringUtils.isEmpty(name)) {
            return "";
        }
        return name.toUpperCase();
    }

    public int caculate(int a, int b) {
        return a + b;
    }

}
