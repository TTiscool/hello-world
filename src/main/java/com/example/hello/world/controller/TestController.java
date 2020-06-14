package com.example.hello.world.controller;


import com.example.hello.world.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Api("swaggerDemoController相关的api")
public class TestController {

    @Autowired
    private LogisticsService logisticsService;


    @GetMapping("index")
    //@ApiOperation(value="测试一下111" ,notes = "修改测试一下111")
    public String index(){
        return "111";
    }


//    @GetMapping("testPage")
//    //@ApiOperation(value="测试一下111" ,notes = "修改测试一下111")
//    public String testPage() {
//        List<Logistics> list = logisticsService.queryPage();
//        for (Logistics logistics : list) {
//            System.out.println(logistics.toString());
//        }
//        return list.toString();
//    }
}


