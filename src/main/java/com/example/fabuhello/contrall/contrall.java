package com.example.fabuhello.contrall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contrall {
    @RequestMapping("/li")
    public String fabu(){
        return "李龙辉的第一个在线发布网站，大家都看看";
    }

}
