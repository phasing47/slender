package com.sp.service.impl;

import com.sp.entity.User;
import com.sp.mapper.UserMapper;
import com.sp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

@Autowired
    UserMapper userMapper;



    @Override
    public  String loginService(String username, String password){
    User user = userMapper.searchByUsername(username);
    if (user != null){
        if (password.equals(user.getPassWord())){
            return "登录成功";
        }else{
            return "密码错误";
        }
    }
    return "此用户不存在";
}
@Override
    public String registerService(User user){
    User user1 = userMapper.searchByUsername(user.getUserName());
    if (user1 == null){
        if ("".equals(user.getPassWord())){
            return "输入密码";
        }else if ("".equals(user.getUserName())){
            return "请输入用户名";
        }else {
            userMapper.insert(user);
            return "注册成功";
        }
    }
    return "该用户已经存在";
}

    @Override
    public List<User> oneToMore(int id) {

        return userMapper.oneToMoreQuery(id);
    }

}
