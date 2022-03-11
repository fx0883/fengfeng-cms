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
@ApiModel(value = "Tbl_weight对象", description = "")
public class Tbl_weight implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String weightKG;

    private String weightLB;

    private String date;

    private String currentDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(String weightKG) {
        this.weightKG = weightKG;
    }
    public String getWeightLB() {
        return weightLB;
    }

    public void setWeightLB(String weightLB) {
        this.weightLB = weightLB;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public String toString() {
        return "Tbl_weight{" +
            "id=" + id +
            ", weightKG=" + weightKG +
            ", weightLB=" + weightLB +
            ", date=" + date +
            ", currentDate=" + currentDate +
        "}";
    }
}
