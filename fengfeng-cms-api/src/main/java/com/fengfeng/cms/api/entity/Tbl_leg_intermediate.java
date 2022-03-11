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
@ApiModel(value = "Tbl_leg_intermediate对象", description = "")
public class Tbl_leg_intermediate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer workout_id;

    private String title;

    private String videoLink;

    private String description;

    private Integer time;

    private String time_type;

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
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    public String getTime_type() {
        return time_type;
    }

    public void setTime_type(String time_type) {
        this.time_type = time_type;
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
        return "Tbl_leg_intermediate{" +
            "workout_id=" + workout_id +
            ", title=" + title +
            ", videoLink=" + videoLink +
            ", description=" + description +
            ", time=" + time +
            ", time_type=" + time_type +
            ", image=" + image +
            ", sort=" + sort +
            ", defaultSort=" + defaultSort +
        "}";
    }
}
