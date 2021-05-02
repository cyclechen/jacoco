package me.cyclechen.demo.jacoco.controller;

import me.cyclechen.demo.jacoco.service.IndexService;
import me.cyclechen.demo.jacoco.vo.BaseMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

@RestController
public class IndexController {

    @Autowired
    public IndexService indexService;


    public BaseMessageVO hello(Model model) {

        String name = (String) model.getAttribute("name");
        System.out.println("got parameter name: " + name);
        if (StringUtils.isEmpty(name)) {
            return BaseMessageVO.error(500, "empty name");
        } else {
            return BaseMessageVO.success("got name " + indexService.convertName(name));
        }

    }

}
