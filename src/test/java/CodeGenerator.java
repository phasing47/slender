import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import javax.swing.*;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "503321xx";
        String mapperLocation = "C:\\Users\\贾鹏杰\\Desktop\\jpj\\src\\main\\resources\\mapper\\";
        String tables = "ms_qzj_srcdata_history,tb_config_user_object,tb_sys_user,twr_src_config_record";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("nobody") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Users\\贾鹏杰\\Desktop\\jpj\\src\\main\\java\\"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.sp") // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix("ms_qzj_", "tb_sys_","twr_src_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
