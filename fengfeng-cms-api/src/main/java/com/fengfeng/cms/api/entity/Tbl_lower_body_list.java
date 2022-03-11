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
@ApiModel(value = "Tbl_lower_body_list对象", description = "")
public class Tbl_lower_body_list implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer workout_id;

    private String title;

    private String videoLink;

    private String description;

    private String time_type;

    private Integer time_beginner;

    private String time_intermidiate;

    private String time_advanced;

    private Integer day_name;

    private Integer week_name;

    private String level;

    private Integer is_completed;

    private String image;

    private Integer sort;

    private Integer defaultSort;

    public Integer getWorkout_id() {
        return workout_id;
    }

    public void setWorkout_id(Integer workout_id) {
        this.workout_id = workout_id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getTime_type() {
        return time_type;
    }

    public void setTime_type(String time_type) {
        this.time_type = time_type;
    }
    public Integer getTime_beginner() {
        return time_beginner;
    }

    public void setTime_beginner(Integer time_beginner) {
        this.time_beginner = time_beginner;
    }
    public String getTime_intermidiate() {
        return time_intermidiate;
    }

    public void setTime_intermidiate(String time_intermidiate) {
        this.time_intermidiate = time_intermidiate;
    }
    public String getTime_advanced() {
        return time_advanced;
    }

    public void setTime_advanced(String time_advanced) {
        this.time_advanced = time_advanced;
    }
    public Integer getDay_name() {
        return day_name;
    }

    public void setDay_name(Integer day_name) {
        this.day_name = day_name;
    }
    public Integer getWeek_name() {
        return week_name;
    }

    public void setWeek_name(Integer week_name) {
        this.week_name = week_name;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public Integer getIs_completed() {
        return is_completed;
    }

    public void setIs_completed(Integer is_completed) {
        this.is_completed = is_completed;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Integer getDefaultSort() {
        return defaultSort;
    }

    public void setDefaultSort(Integer defaultSort) {
        this.defaultSort = defaultSort;
    }

    @Override
    public String toString() {
        return "Tbl_lower_body_list{" +
            "workout_id=" + workout_id +
            ", title=" + title +
            ", videoLink=" + videoLink +
            ", description=" + description +
            ", time_type=" + time_type +
            ", time_beginner=" + time_beginner +
            ", time_intermidiate=" + time_intermidiate +
            ", time_advanced=" + time_advanced +
            ", day_name=" + day_name +
            ", week_name=" + week_name +
            ", level=" + level +
            ", is_completed=" + is_completed +
            ", image=" + image +
            ", sort=" + sort +
            ", defaultSort=" + defaultSort +
        "}";
    }
}
