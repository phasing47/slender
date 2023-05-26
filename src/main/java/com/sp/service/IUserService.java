package com.sp.service;

import com.sp.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@Service
public interface IUserService extends IService<User> {

@Resource
     String loginService(String username, String password);

     String registerService(User user);

     List<User> oneToMore(int id);
}
