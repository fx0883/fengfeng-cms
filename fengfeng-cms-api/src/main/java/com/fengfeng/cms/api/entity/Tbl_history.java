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
@ApiModel(value = "Tbl_history对象", description = "")
public class Tbl_history implements Serializable {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String planId;

    private String fromPage;

    private String tableName;

    private String duration;

    private String planName;

    private String dateTime;

    private String completionTime;

    private String burnKcal;

    private String totalWorkout;

    private String kg;

    private String cm;

    private String feelRate;

    private String day_name;

    private String week_name;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }
    public String getFromPage() {
        return fromPage;
    }

    public void setFromPage(String fromPage) {
        this.fromPage = fromPage;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }
    public String getBurnKcal() {
        return burnKcal;
    }

    public void setBurnKcal(String burnKcal) {
        this.burnKcal = burnKcal;
    }
    public String getTotalWorkout() {
        return totalWorkout;
    }

    public void setTotalWorkout(String totalWorkout) {
        this.totalWorkout = totalWorkout;
    }
    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }
    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }
    public String getFeelRate() {
        return feelRate;
    }

    public void setFeelRate(String feelRate) {
        this.feelRate = feelRate;
    }
    public String getDay_name() {
        return day_name;
    }

    public void setDay_name(String day_name) {
        this.day_name = day_name;
    }
    public String getWeek_name() {
        return week_name;
    }

    public void setWeek_name(String week_name) {
        this.week_name = week_name;
    }

    @Override
    public String toString() {
        return "Tbl_history{" +
            "Id=" + Id +
            ", planId=" + planId +
            ", fromPage=" + fromPage +
            ", tableName=" + tableName +
            ", duration=" + duration +
            ", planName=" + planName +
            ", dateTime=" + dateTime +
            ", completionTime=" + completionTime +
            ", burnKcal=" + burnKcal +
            ", totalWorkout=" + totalWorkout +
            ", kg=" + kg +
            ", cm=" + cm +
            ", feelRate=" + feelRate +
            ", day_name=" + day_name +
            ", week_name=" + week_name +
        "}";
    }
}
