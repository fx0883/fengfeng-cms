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
@ApiModel(value = "Discover_plan_table对象", description = "")
public class Discover_plan_table implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer planId;

    private String planName;

    private String planText;

    private String planLvl;

    private String planImage;

    private String planImageSub;

    private String planType;

    private Integer planWorkouts;

    private Integer planMinutes;

    private String shortDes;

    private String hasSubPlan;

    private String parentPlanId;

    private String discoverCatName;

    private String introduction;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public String getPlanText() {
        return planText;
    }

    public void setPlanText(String planText) {
        this.planText = planText;
    }
    public String getPlanLvl() {
        return planLvl;
    }

    public void setPlanLvl(String planLvl) {
        this.planLvl = planLvl;
    }
    public String getPlanImage() {
        return planImage;
    }

    public void setPlanImage(String planImage) {
        this.planImage = planImage;
    }
    public String getPlanImageSub() {
        return planImageSub;
    }

    public void setPlanImageSub(String planImageSub) {
        this.planImageSub = planImageSub;
    }
    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
    public Integer getPlanWorkouts() {
        return planWorkouts;
    }

    public void setPlanWorkouts(Integer planWorkouts) {
        this.planWorkouts = planWorkouts;
    }
    public Integer getPlanMinutes() {
        return planMinutes;
    }

    public void setPlanMinutes(Integer planMinutes) {
        this.planMinutes = planMinutes;
    }
    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }
    public String getHasSubPlan() {
        return hasSubPlan;
    }

    public void setHasSubPlan(String hasSubPlan) {
        this.hasSubPlan = hasSubPlan;
    }
    public String getParentPlanId() {
        return parentPlanId;
    }

    public void setParentPlanId(String parentPlanId) {
        this.parentPlanId = parentPlanId;
    }
    public String getDiscoverCatName() {
        return discoverCatName;
    }

    public void setDiscoverCatName(String discoverCatName) {
        this.discoverCatName = discoverCatName;
    }
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Discover_plan_table{" +
            "planId=" + planId +
            ", planName=" + planName +
            ", planText=" + planText +
            ", planLvl=" + planLvl +
            ", planImage=" + planImage +
            ", planImageSub=" + planImageSub +
            ", planType=" + planType +
            ", planWorkouts=" + planWorkouts +
            ", planMinutes=" + planMinutes +
            ", shortDes=" + shortDes +
            ", hasSubPlan=" + hasSubPlan +
            ", parentPlanId=" + parentPlanId +
            ", discoverCatName=" + discoverCatName +
            ", introduction=" + introduction +
        "}";
    }
}
