package org.note.function.controller;


import org.note.function.mapper.DataSourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DataSourceMapper dataSourceMapper;

    @GetMapping("/d")
    public List<String> get() {
        System.out.println("12121");
        List<String> user = dataSourceMapper.getUser();
        System.out.println("12121");
        return user;
    }


    @GetMapping("/d2")
    public List<String> get2() {
        System.out.println("222");
        List<String> user = dataSourceMapper.getUser2();
        System.out.println("222");
        return user;
    }

    @GetMapping("/add")
    public void add(@RequestParam("name")String name,
                    @RequestParam("age")Integer age,
                    @RequestParam("addr")String addr) {
        System.out.println("add 1");
        dataSourceMapper.add(name,age,addr);
        System.out.println("add 2");
    }


    @GetMapping("/addCast")
    public void addCast(@RequestParam("name")String name,
                    @RequestParam("type")String type,
                    @RequestParam("value")String value) {
        System.out.println("add 1cast");
        dataSourceMapper.addCast(name,type,value);
        System.out.println("add 2cast");
    }


}
