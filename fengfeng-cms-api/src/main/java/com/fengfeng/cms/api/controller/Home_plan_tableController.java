package com.fengfeng.cms.api.controller;

import com.fengfeng.cms.api.entity.Home_plan_table;
import com.fengfeng.cms.api.service.IHome_plan_tableService;
import com.fengfeng.cms.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
@RestController
@RequestMapping("/api/home_plan_table")
public class Home_plan_tableController {
    @Autowired
    private IHome_plan_tableService home_plan_tableService;

    @GetMapping("/list")
    public Result getHomePlanData() {
        List<Home_plan_table> homePlanTableList = home_plan_tableService.getHomePlanData();
        return Result.ok(homePlanTableList);
    }
}
