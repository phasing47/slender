package com.sp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author nobody
 * @since 2023-05-23
 */
@TableName("ms_qzj_srcdata_history")
public class SrcdataHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 站点
     */
    private String stcd;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 传感器Id
     */
    private String sensorid;

    /**
     * 采集时间
     */
    private LocalDateTime tm;

    /**
     * 值
     */
    private Double value;

    /**
     * 更新时间
     */
    private LocalDateTime updatetm;

    /**
     * 来源1，注：标识字段，填充0即可
     */
    private Integer chltype;

    /**
     * 来源2，注：标识字段，填充0即可
     */
    private Integer srctype;

    /**
     * 处理标志，0：未处理；1：处理成功；2：处理失败
     */
    private Integer flag;

    /**
     * 处理时间
     */
    private LocalDateTime handletm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }
    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }
    public String getSensorid() {
        return sensorid;
    }

    public void setSensorid(String sensorid) {
        this.sensorid = sensorid;
    }
    public LocalDateTime getTm() {
        return tm;
    }

    public void setTm(LocalDateTime tm) {
        this.tm = tm;
    }
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    public LocalDateTime getUpdatetm() {
        return updatetm;
    }

    public void setUpdatetm(LocalDateTime updatetm) {
        this.updatetm = updatetm;
    }
    public Integer getChltype() {
        return chltype;
    }

    public void setChltype(Integer chltype) {
        this.chltype = chltype;
    }
    public Integer getSrctype() {
        return srctype;
    }

    public void setSrctype(Integer srctype) {
        this.srctype = srctype;
    }
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
    public LocalDateTime getHandletm() {
        return handletm;
    }

    public void setHandletm(LocalDateTime handletm) {
        this.handletm = handletm;
    }

    @Override
    public String toString() {
        return "SrcdataHistory{" +
            "id=" + id +
            ", stcd=" + stcd +
            ", datatype=" + datatype +
            ", sensorid=" + sensorid +
            ", tm=" + tm +
            ", value=" + value +
            ", updatetm=" + updatetm +
            ", chltype=" + chltype +
            ", srctype=" + srctype +
            ", flag=" + flag +
            ", handletm=" + handletm +
        "}";
    }
}
