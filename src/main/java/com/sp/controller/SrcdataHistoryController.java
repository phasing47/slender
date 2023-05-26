package com.sp.controller;

import com.sp.entity.SrcdataHistory;
import com.sp.service.ISrcdataHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@RestController
@RequestMapping("/History")
public class SrcdataHistoryController {
    @Autowired
    private ISrcdataHistoryService iSrcdataHistoryService;
    @ResponseBody
    @RequestMapping("/get")
    public List<SrcdataHistory> get(){
        return iSrcdataHistoryService.list(null);
    }
    @PostMapping("/add")
    public boolean insert(@RequestBody SrcdataHistory srcdataHistory){
        return iSrcdataHistoryService.save(srcdataHistory);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody SrcdataHistory srcdataHistory){
        return iSrcdataHistoryService.updateById(srcdataHistory);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@RequestBody SrcdataHistory srcdataHistory){
        return iSrcdataHistoryService.removeById(srcdataHistory);
    }

}
