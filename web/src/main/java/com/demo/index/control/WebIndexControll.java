package com.demo.index.control;

import com.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebIndexControll {
    @Autowired
    IndexService indexService;

    @GetMapping("/index")
    public String index(){
        return "hello my spring";
    }

    @GetMapping("/custom-return")
    public String customReturn(){
        return indexService.testReturn();
    }
}
