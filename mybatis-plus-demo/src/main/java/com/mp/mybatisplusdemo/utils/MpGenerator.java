package com.mp.mybatisplusdemo.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 描述：mybatis-plus代码生成工具类
 *
 * @author TX
 * @version 1.0
 * @date 2022/02/17
 */
public class MpGenerator {
    public static void main(String[] args) {
        //获取项目路径
        String projectUrl = System.getProperty("user.dir");

        FastAutoGenerator.create(
                "jdbc:mysql://192.168.56.195:3306/demo?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=true",
                "root",
                "root").globalConfig(builder -> {
                    builder.author("TX")//设置作者
                            .fileOverride()//覆盖已生成文件
                            .enableSwagger() // 开启 swagger模式（接口文档）
                            .outputDir(projectUrl+"//src//main//java");//输出目录
        }).packageConfig(builder -> {
            builder.parent("com.mp.mybatisplusdemo.user")
                    .pathInfo(Collections.singletonMap(OutputFile.mapperXml,projectUrl+"//src//main//resources//mapper"));//mapper文件生成的位置
        }).strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_")// 设置过滤表前缀
                            .entityBuilder()
                            .enableLombok();//使用lombok
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
