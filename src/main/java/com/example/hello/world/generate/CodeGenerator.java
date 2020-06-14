package com.example.hello.world.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class CodeGenerator {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("E://IdeaProjects/hello-world/src/main/java");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("11111");// 作者

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://localhost:3306/ttiscool?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setTablePrefix(new String[] { "sys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { "user_t" ,"logistics" }); // 需要生成的表

        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.hello.world");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("dao");
        pc.setEntity("model");
        pc.setXml("xml");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();

    }
//    public static void main(String[] args) {
//        //代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//        mpg.setGlobalConfig(globalConfig());
//        mpg.setDataSource(dataSourceConfig());
//        mpg.setStrategy(strategyConfig());
//        mpg.setPackageInfo(packageConfig());
//        mpg.execute();
//    }
//
//    /**
//     * 全局配置
//     */
//    private static GlobalConfig globalConfig() {
//        GlobalConfig config = new GlobalConfig();
//        config.setActiveRecord(false) // 是否开启AR模式
//                .setAuthor("111111") //生成的文件头@author
//                .setOutputDir("E://IdeaProjects/hello-world/src/main/javacom/example/hello/world") //生成路径
//                .setFileOverride(true) //文件是否覆盖
//                .setIdType(IdType.AUTO) // 主键策略
//                .setServiceName("%sService") //文件名称方式，例如： %sAction 生成 UserAction, %s 为占位符默认情况下生成的Service接口的名字首字母都带有I
//                .setBaseResultMap(true) // 是否生成基本的sql中的ResultMap
//                .setBaseColumnList(true) // 是否生成基本的sql列
//                .setSwagger2(true)//实体属性 Swagger2 注解
//                .setOpen(false);//生成后是否自动打开文件夹
//        return config;
//    }
//
//    /**
//     * 数据库连接信息
//     *
//     * @return
//     */
//    private static DataSourceConfig dataSourceConfig() {
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setUrl("jdbc:mysql://localhost:3306/ttiscool?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        return dsc;
//    }
//
//    /**
//     * 策略配置
//     */
//    private static StrategyConfig strategyConfig() {
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setCapitalMode(true); // 是否大写命名
//        // 表前缀
//        //strategyConfig.setTablePrefix("");
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel); // 从数据库表到文件的命名策略
//        //需要包含的表名，允许正则表达式（与exclude二选一配置）
//        strategyConfig.setInclude("user_t"); // 数据库表名，需要存在
//
//
//        //数据库表字段映射到实体的命名策略,原样输出no_change,下划线转驼峰命underline_to_camel;
//        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
//        //自定义继承的Entity类全称，带包名
//        //strategyConfig.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
//        //是否为lombok模型（默认 false）
//        strategyConfig.setEntityLombokModel(true);
//        //生成控制器
//        strategyConfig.setRestControllerStyle(true);
//        //实体是否生成 serialVersionUID
//        strategyConfig.setEntitySerialVersionUID(true);
//        // 自定义继承的Controller类全称，带包名
//        //strategyConfig.setSuperControllerClass("com.baomidou.ant.common.BaseController");
//        //自定义基础的Entity类，公共字段
//        //strategyConfig.setSuperEntityColumns("id");
//        //驼峰转连字符
//        //strategyConfig.setControllerMappingHyphenStyle(true);
//        //表前缀
//        //strategyConfig.setTablePrefix();
//        return strategyConfig;
//    }
//
//    /**
//     * 包名策略配置
//     */
//    private static PackageConfig packageConfig() {
//        PackageConfig packageConfig = new PackageConfig();
//        packageConfig.setParent("com.example.hello.world"); // 总包名
//        packageConfig.setEntity("model123"); // 实体生成后所在包名
//        packageConfig.setController("controller123");
//        packageConfig.setService("service123");
//        packageConfig.setMapper("mapper123");
//        packageConfig.setXml("mapper123");
//        return packageConfig;
//    }
//
////    /**
////     * 自定义配置
////     *
////     * @return
////     */
////    private static InjectionConfig injectionConfig() {
////        InjectionConfig injectionConfig = new InjectionConfig() {
////            @Override
////            public void initMap() {
////                // to do nothing
////            }
////        };
////        // 如果模板引擎是 freemarker
////        String templatePath = "/templates/mapper.xml.ftl";
////        // 如果模板引擎是 velocity
////        // String templatePath = "/templates/mapper.xml.vm";
////
////        // 自定义输出配置
////        List<FileOutConfig> focList = new ArrayList<>();
////        // 自定义配置会被优先输出
////        focList.add(new FileOutConfig(templatePath) {
////            @Override
////            public String outputFile(TableInfo tableInfo) {
////                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
////                return "E://IdeaProjects/hello-world/src/main/java  " + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
////            }
////        });
////        /*
////        cfg.setFileCreate(new IFileCreate() {
////            @Override
////            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
////                // 判断自定义文件夹是否需要创建
////                checkDir("调用默认方法创建的目录");
////                return false;
////            }
////        });
////        */
////        injectionConfig.setFileOutConfigList(focList);
////        return injectionConfig;
////    }
//
//    /**
//     * 配置模板
//     *
//     * @return
//     */
//    private static TemplateConfig templateConfig() {
//        TemplateConfig templateConfig = new TemplateConfig();
//        // 配置自定义输出模板
//        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
//        // templateConfig.setEntity("templates/entity2.java");
//        // templateConfig.setService();
//        // templateConfig.setController();
//        templateConfig.setXml(null);
//        return templateConfig;
//    }


}
