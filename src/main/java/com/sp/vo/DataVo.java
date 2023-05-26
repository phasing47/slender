package com.sp.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sp.entity.ConfigRecord;
import com.sp.entity.TbConfigUserObject;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DataVo {
    /**
     * 主键，自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private Integer isFrozen;
    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;
    private ConfigRecord configRecord;
}
