package com.sp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户关联监测对象表
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@TableName("tb_config_user_object")
public class TbConfigUserObject extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户Id，用户表主键
     */
    @TableField(exist = false)
    private Integer userId;

    /**
     * 对象编码，twr_src_config_record表的主键
     */
    @TableField(exist = false)
    private String objectCode;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    @Override
    public String toString() {
        return "TbConfigUserObject{" +
            "userId=" + userId +
            ", objectCode=" + objectCode +
        "}";
    }
}
