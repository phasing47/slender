package com.sp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@Data
@TableName("tb_sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键，自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(exist = false)
    private List<ConfigRecord> configRecords;


    /**
     * 用户名，唯一
     */

    private String userName;


    /**
     * 密码
     */
    private String passWord;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 账号是否冻结，默认值0：未冻结，1：冻结
     */
    private Integer isFrozen;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifiedTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", userName=" + userName +
            ", passWord=" + passWord +
            ", realName=" + realName +
            ", isFrozen=" + isFrozen +
            ", createTime=" + createTime +
            ", modifiedTime=" + modifiedTime +
        "}";
    }
}
