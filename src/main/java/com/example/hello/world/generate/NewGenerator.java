package com.example.hello.world.generate;

import com.github.mybatis.fl.entity.BasisInfo;
import com.github.mybatis.fl.util.EntityInfoUtil;
import com.github.mybatis.fl.util.Generator;
import com.github.mybatis.fl.util.MySqlToJavaUtil;

import java.sql.SQLException;
import java.util.Date;

public class NewGenerator {

    // 基础信息：项目名、作者、版本
    public static final String PROJECT = "hellow-orld";
    public static final String AUTHOR = "123123";
    public static final String VERSION = "V1.0";
    // 数据库连接信息：连接URL、用户名、秘密、数据库名
    public static final String URL = "jdbc:mysql://localhost:3306/ttiscool?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false";
    public static final String NAME = "root";
    public static final String PASS = "root";
    public static final String DATABASE = "ttiscool";
    // 类信息：类名、对象名（一般是【类名】的首字母小些）、类说明、时间
    public static final String CLASSNAME = "UserT";
    public static final String TABLE = "user_t";
    public static final String CLASSCOMMENT = "用户表";
    public static final String TIME = "2020年6月11日";
    public static final String AGILE = new Date().getTime() + "";
    // 路径信息，分开路径方便聚合工程项目，微服务项目
    public static final String ENTITY_URL = "com.example.hello.world.entity";
    public static final String DAO_URL = "com.example.hello.world.dao";
    public static final String XML_URL = "com.example.hello.world.dao.impl";
    public static final String SERVICE_URL = "com.example.hello.world.service";
    public static final String SERVICE_IMPL_URL = "com.example.hello.world.service.impl";
    public static final String CONTROLLER_URL = "com.example.hello.world.controller";
    //是否是Swagger配置
    public static final String IS_SWAGGER = "true";

    public static void main(String[] args) {
        BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASS, DATABASE, CLASSNAME, AGILE, ENTITY_URL, DAO_URL, XML_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL);
        bi.setTable(TABLE);
        bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
        bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
        bi.setEntityComment(CLASSCOMMENT);
        try {
            bi = EntityInfoUtil.getInfo(bi);
            String fileUrl = "E://IdeaProjects/hello-world/src/main/java/";// 生成文件存放位置
            //开始生成文件
            String aa1 = Generator.createEntity(fileUrl, bi).toString();
            String aa2 = Generator.createDao(fileUrl, bi).toString();
            String aa3 = Generator.createDaoImpl(fileUrl, bi).toString();
            String aa4 = Generator.createService(fileUrl, bi).toString();
            String aa5 = Generator.createServiceImpl(fileUrl, bi).toString();
            String aa6 = Generator.createController(fileUrl, bi).toString();

            System.out.println(aa1);
            System.out.println(aa2); System.out.println(aa3); System.out.println(aa4);
            System.out.println(aa5); System.out.println(aa6);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
