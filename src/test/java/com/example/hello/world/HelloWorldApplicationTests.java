package com.example.hello.world;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.hello.world.domain.Logistics;
import com.example.hello.world.mapper.LogisticsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HelloWorldApplicationTests {

    @Autowired
    private LogisticsMapper logisticsMapper;

    @Test
    void contextLoads() {
        Logistics logistics = new Logistics();
        logistics.setEcode("123");
        logistics.setEname("顺丰快递");
        logistics.setShortName("SF");
        int insert = logisticsMapper.insert(logistics);
        //创建一个UpdateWrapper 使用.eq(colume,val) 设置条件
        Logistics logistics222 = new Logistics();
        logistics222.setEcode("321");
        logistics222.setEname("天天快递");
        logistics222.setShortName("TT");
        UpdateWrapper<Logistics> updateByNmae = new UpdateWrapper<Logistics>().eq("ename", "顺丰快递");
        int update = logisticsMapper.update(logistics222,updateByNmae);

        //根据Wrapper条件构造器查询
//        List<Logistics> ocBOrders1 = LogisticsMapper.selectList(new LambdaQueryWrapper<Logistics>().select(Logistics::getId, Logistics::getEcode).eq(Logistics::getId, 1));
//        List<Logistics> ocBOrders2 = LogisticsMapper.selectList(Wrappers.<Logistics>query().select("id", "ecode").eq("id", 1));
//        List<Logistics> ocBOrders3 = LogisticsMapper.selectList(new QueryWrapper<Logistics>().select("id", "ecode").eq("id", 1));

        QueryWrapper<Logistics> logisticsQueryWrapper = new QueryWrapper<>();
        Logistics logistics333 = new Logistics();
        logistics333.setEname("天天快递");
        logisticsQueryWrapper.setEntity(logistics333);
        Integer logisticsQueryWrapperCount = logisticsMapper.selectCount(logisticsQueryWrapper);
        System.out.println("查询总数:"+logisticsQueryWrapperCount);

        List<Logistics> logistics1 = logisticsMapper.selectList(new QueryWrapper<Logistics>().select("id", "ecode").eq("id", 1));

    }

}
