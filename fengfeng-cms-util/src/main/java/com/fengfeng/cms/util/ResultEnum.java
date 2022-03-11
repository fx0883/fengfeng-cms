package com.fengfeng.cms.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {

    SUCCESS(200, "成功"),
    ERROR(-1, "失败");

    private Integer code;
    private String desc;

}
