package com.sp.controller;

import com.sp.entity.ConfigRecord;
import com.sp.service.IConfigRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 前置机映射配置记录表：用于对应映射未配置到系统前时，自定义查询使用 前端控制器
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@RestController
@RequestMapping("/Record")
public class ConfigRecordController {
    @Autowired
    public IConfigRecordService iConfigRecordService;
    @ResponseBody
    @RequestMapping("/get")
    public List<ConfigRecord> get(){
        return iConfigRecordService.list(null);
    }
    @PostMapping("/add")
    public boolean insert(@RequestBody ConfigRecord configRecord){
        return iConfigRecordService.save(configRecord);
    }
    @PutMapping("/update")
    public boolean update (@RequestBody ConfigRecord configRecord){
        return iConfigRecordService.updateById(configRecord);
    }
    @DeleteMapping("/{code}")
    public boolean delete(@RequestBody ConfigRecord configRecord){
        return iConfigRecordService.removeById(configRecord);
    }
}
