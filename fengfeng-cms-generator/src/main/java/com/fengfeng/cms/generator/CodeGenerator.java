package com.fengfeng.cms.generator;
import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;

import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.Scanner;

public class CodeGenerator {

    // 生成的代码放到哪个工程中
    private static String PROJECT_NAME = "fengfeng-cms-api";

    // 数据库名称
    private static String DATABASE_NAME = "workoutdb";

    public static void main(String[] args) {
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3306/"+ DATABASE_NAME +"?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        mpg.setDataSource(dsc);
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir") + "/";
//        gc.setOutputDir(projectPath + PROJECT_NAME +"/src/main/java");
//        gc.setIdType(IdType.AUTO); // 自增长id
//        gc.setAuthor("梦学谷-www.mengxuegu.com");
//        gc.setFileOverride(true); //覆盖现有的
//        gc.setOpen(false); //是否生成后打开
//        gc.setDateType(DateType.ONLY_DATE);
//        mpg.setGlobalConfig(gc);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.mengxuegu.member"); //父包名
//        mpg.setPackageInfo(pc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setEntityLombokModel(true); //使用lombok
//        strategy.setEntitySerialVersionUID(true);// 实体类的实现接口Serializable
//        strategy.setRestControllerStyle(true); // @RestController
//        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
//        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix("tb_"); // 去掉表前缀
//        mpg.setStrategy(strategy);
//
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//        mpg.execute();

        String url = "jdbc:mysql://localhost:3306/"+ DATABASE_NAME +"?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
        String projectPath = System.getProperty("user.dir") + "/";
        String outputDir = projectPath + PROJECT_NAME +"/src/main/java";

//        String tttt = Collections.singletonMap(OutputFile.xml, outputDir);
        FastAutoGenerator.create(url, "root", "12345678")
                .globalConfig(builder -> {
                    builder.author("fengfeng") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride()
                            .outputDir(outputDir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.fengfeng.cms") // 设置父包名
                            .moduleName("api"); // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, outputDir)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
//                    builder.addInclude("t_simple") // 设置需要生成的表名
//                    builder.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                    builder.entityBuilder()
                            .naming(NamingStrategy.no_change)
                            .columnNaming(NamingStrategy.no_change);
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();


    }


//    /**
//     * <p>
//     * 读取控制台内容
//     * </p>
//     */
//    public static String scanner(String tip) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder help = new StringBuilder();
//        help.append("请输入" + tip + "：");
//        System.out.println(help.toString());
//        if (scanner.hasNext()) {
//            String ipt = scanner.next();
//            if (StringUtils.isNotBlank(ipt)) {
//                return ipt;
//            }
//        }
//        throw new MybatisPlusException("请输入正确的" + tip + "！");
//    }

}
