package com.sp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sp.entity.User;
import com.sp.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpjApplicationTests {

    @Autowired
    private IUserService iUserService;

    //单条插入
    @Test
    void test1() {

        User user = new User();
        user.setId(1);
        user.setUserName("想周周");
        user.setPassWord("521");
        user.setRealName("好看捏");

        boolean flag = iUserService.save(user);
        System.out.println(flag);
    }
    //批量插入
    @Test
    void test2() {

        List<User> userList = new ArrayList<>();

        User user=new User();
        user.setUserName("浮");
        user.setPassWord("789256");
        user.setRealName("周淑怡");

        User user2=new User();
        user2.setUserName("C");
        user2.setPassWord("123654");
        user2.setRealName("韩金龙");

        userList.add(user);
        userList.add(user2);

        boolean flag= iUserService.saveBatch(userList);
        System.out.println(flag);
    }
    //更改
    @Test
    void test3() {

        User user=new User();
        user.setId(4);
        user.setUserName("雪梨");
        user.setPassWord("789456");
        user.setRealName("摇摆羊");

        boolean flag=iUserService.saveOrUpdate(user);
        System.out.println(flag);

    }
    //删除
    @Test
    void  test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("user_name","周五不来");
        boolean flag = iUserService.remove(wrapper);
        System.out.println(flag);

    }
    @Test
    void test5(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name","周一太困");
        User user = iUserService.getOne(wrapper);
        user.setUserName("周五不来");
        boolean flag = iUserService.updateById(user);
        System.out.println(flag);
    }
    //查询一个
    @Test
    void test6(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("user_name","抽象周").last("LiMIT 1");
        User user = iUserService.getOne(wrapper);
        System.out.println(user);
    }
    //批量查询
    @Test
    void test7(){
        QueryWrapper<User> wrapper =new QueryWrapper<>();
        wrapper.like("user_name","C");
        List<User>userList=iUserService.list(wrapper);
        System.out.println(userList);
    }
    //查询数量
    @Test
    void test8(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("real_name","韩金龙");
        int count = (int) iUserService.count(wrapper);
        System.out.println(count);


    }

}
