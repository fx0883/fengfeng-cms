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
@ApiModel(value = "Home_plan_table对象", description = "")
public class Home_plan_table implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer catId;

    private String catName;

    private Integer catDefficultyLevel;

    private String catSubCategory;

    private String catImage;

    private String catTableName;

    private String catText;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
    public Integer getCatDefficultyLevel() {
        return catDefficultyLevel;
    }

    public void setCatDefficultyLevel(Integer catDefficultyLevel) {
        this.catDefficultyLevel = catDefficultyLevel;
    }
    public String getCatSubCategory() {
        return catSubCategory;
    }

    public void setCatSubCategory(String catSubCategory) {
        this.catSubCategory = catSubCategory;
    }
    public String getCatImage() {
        return catImage;
    }

    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }
    public String getCatTableName() {
        return catTableName;
    }

    public void setCatTableName(String catTableName) {
        this.catTableName = catTableName;
    }
    public String getCatText() {
        return catText;
    }

    public void setCatText(String catText) {
        this.catText = catText;
    }

    @Override
    public String toString() {
        return "Home_plan_table{" +
            "catId=" + catId +
            ", catName=" + catName +
            ", catDefficultyLevel=" + catDefficultyLevel +
            ", catSubCategory=" + catSubCategory +
            ", catImage=" + catImage +
            ", catTableName=" + catTableName +
            ", catText=" + catText +
        "}";
    }
}
