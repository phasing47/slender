package com.sp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 前置机映射配置记录表：用于对应映射未配置到系统前时，自定义查询使用
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@TableName("twr_src_config_record")
public class ConfigRecord implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 监测对象编码
     */
    private String code;

    /**
     * 监测对象编码
     */
    private String parentCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 测站编码
     */
    private String stcd;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 传感器ID
     */
    private String sensorId;

    /**
     * 备注
     */
    private String text;

    /**
     * 显示顺序
     */
    private Integer disOrder;



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public Integer getDisOrder() {
        return disOrder;
    }

    public void setDisOrder(Integer disOrder) {
        this.disOrder = disOrder;
    }

    @Override
    public String toString() {
        return "ConfigRecord{" +
            "code=" + code +
            ", parentCode=" + parentCode +
            ", name=" + name +
            ", stcd=" + stcd +
            ", dataType=" + dataType +
            ", sensorId=" + sensorId +
            ", text=" + text +
            ", disOrder=" + disOrder +
        "}";
    }
}
