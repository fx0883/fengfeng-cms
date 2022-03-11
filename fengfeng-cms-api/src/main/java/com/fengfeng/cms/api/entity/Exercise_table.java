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
@ApiModel(value = "Exercise_table对象", description = "")
public class Exercise_table implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer exId;

    private String exName;

    private String exUnit;

    private String exDescription;

    private Integer exTime;

    private String exPath;

    private String exVideo;

    public Integer getExId() {
        return exId;
    }

    public void setExId(Integer exId) {
        this.exId = exId;
    }
    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }
    public String getExUnit() {
        return exUnit;
    }

    public void setExUnit(String exUnit) {
        this.exUnit = exUnit;
    }
    public String getExDescription() {
        return exDescription;
    }

    public void setExDescription(String exDescription) {
        this.exDescription = exDescription;
    }
    public Integer getExTime() {
        return exTime;
    }

    public void setExTime(Integer exTime) {
        this.exTime = exTime;
    }
    public String getExPath() {
        return exPath;
    }

    public void setExPath(String exPath) {
        this.exPath = exPath;
    }
    public String getExVideo() {
        return exVideo;
    }

    public void setExVideo(String exVideo) {
        this.exVideo = exVideo;
    }

    @Override
    public String toString() {
        return "Exercise_table{" +
            "exId=" + exId +
            ", exName=" + exName +
            ", exUnit=" + exUnit +
            ", exDescription=" + exDescription +
            ", exTime=" + exTime +
            ", exPath=" + exPath +
            ", exVideo=" + exVideo +
        "}";
    }
}
