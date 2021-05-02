package me.cyclechen.demo.jacoco.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexServiceTest {

    @Autowired
    IndexService indexService;

    @Test
    void convertName() {
        String name = "abc";
        String convertedName = indexService.convertName(name);
        System.out.println("name is "+name +" result is "+convertedName);
        assertTrue(StringUtils.equals(name.toUpperCase(), convertedName));
    }


    @Test
    void caculate() {

        int a = 1;
        int b = 1;
        assertEquals(indexService.caculate(a, b), 2);
    }
}