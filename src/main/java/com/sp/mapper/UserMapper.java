package com.sp.mapper;

import com.sp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */


@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

     List<User> oneToMoreQuery(int id);

     User searchByUsername(String username);
}
