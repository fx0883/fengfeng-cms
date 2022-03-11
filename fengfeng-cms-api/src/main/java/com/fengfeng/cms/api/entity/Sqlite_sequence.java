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
@ApiModel(value = "Sqlite_sequence对象", description = "")
public class Sqlite_sequence implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer seq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "Sqlite_sequence{" +
            "name=" + name +
            ", seq=" + seq +
        "}";
    }
}
