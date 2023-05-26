package com.sp.mapper;

import com.sp.entity.TbConfigUserObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户关联监测对象表 Mapper 接口
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@Mapper
@Repository
public interface TbConfigUserObjectMapper extends BaseMapper<TbConfigUserObject> {
}
