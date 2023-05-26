package com.sp.service.impl;

import com.sp.entity.ConfigRecord;
import com.sp.mapper.ConfigRecordMapper;
import com.sp.service.IConfigRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 前置机映射配置记录表：用于对应映射未配置到系统前时，自定义查询使用 服务实现类
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@Service
public class ConfigRecordServiceImpl extends ServiceImpl<ConfigRecordMapper, ConfigRecord> implements IConfigRecordService {

}
