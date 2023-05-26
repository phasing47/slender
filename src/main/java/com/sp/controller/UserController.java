package com.sp.controller;

import com.sp.entity.ConfigRecord;
import com.sp.entity.User;
import com.sp.mapper.UserMapper;
import com.sp.service.IUserService;
import com.sp.util.Result;
import com.sp.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private IUserService iUserService;

    @RequestMapping("/oneToMore")
    public List<User> oneToMore(int id){
        return iUserService.oneToMore(id);
    }
    @ResponseBody
    //获取数据
    @RequestMapping("/all")
    public List<User> get(){
        return iUserService.list(null);

    }
//新增数据
    @PostMapping("/add")
    public boolean insert(@RequestBody User user){

        return iUserService.save(user);
    }
//根据ID更改数据
@PutMapping("/update")
public boolean update(@RequestBody  User user){

        return iUserService.updateById(user);
}
//根据ID删除数据
@DeleteMapping("/{id}")
public boolean delete(@PathVariable Integer id){

        return iUserService.removeById(id);
}
@RequestMapping("/login")
    public Result login(@RequestBody @RequestParam(required = false) String username, @RequestParam(required = false) String password){
        String msg = iUserService.loginService(username,password);
        System.out.println("name:" + username +"password:"+password);
        if (("登录成功").equals(msg)){
            return ResultUtil.success("登录成功");
        }else {
            return ResultUtil.error(msg);
        }

}
    @RequestMapping("/register")
    public Result login(@RequestBody User user){
        String msg = iUserService.registerService(user);
        if (("SUCCESS").equals(msg)){
            return ResultUtil.success("注册成功");
        }else {
            return ResultUtil.error(msg);
        }
    }

}

