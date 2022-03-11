package com.fengfeng.cms.api.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
@ApiModel(value = "Tbl_reminder对象", description = "")
public class Tbl_reminder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String time;

    private String days;

    private String isActive;

    private String repeatNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    public String getRepeatNo() {
        return repeatNo;
    }

    public void setRepeatNo(String repeatNo) {
        this.repeatNo = repeatNo;
    }

    @Override
    public String toString() {
        return "Tbl_reminder{" +
            "id=" + id +
            ", time=" + time +
            ", days=" + days +
            ", isActive=" + isActive +
            ", repeatNo=" + repeatNo +
        "}";
    }
}
