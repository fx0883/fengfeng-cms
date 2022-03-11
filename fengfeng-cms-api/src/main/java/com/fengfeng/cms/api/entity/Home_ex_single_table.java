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
@ApiModel(value = "Home_ex_single_table对象", description = "")
public class Home_ex_single_table implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer planId;

    private Integer exId;

    private Integer exTime;

    private String isCompleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
    public Integer getExId() {
        return exId;
    }

    public void setExId(Integer exId) {
        this.exId = exId;
    }
    public Integer getExTime() {
        return exTime;
    }

    public void setExTime(Integer exTime) {
        this.exTime = exTime;
    }
    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Home_ex_single_table{" +
            "id=" + id +
            ", planId=" + planId +
            ", exId=" + exId +
            ", exTime=" + exTime +
            ", isCompleted=" + isCompleted +
        "}";
    }
}
