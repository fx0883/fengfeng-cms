package com.fengfeng.cms.api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fengfeng.cms.api.entity.Tbl_full_body_workouts_list;
import com.fengfeng.cms.api.service.ITbl_full_body_workouts_listService;
import com.fengfeng.cms.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
@RestController
@RequestMapping("/api/tbl_full_body_workouts_list")
public class Tbl_full_body_workouts_listController {
    @Autowired
    private ITbl_full_body_workouts_listService tbl_full_body_workouts_listService;

    @PostMapping("/list/getWeekDaysData/{page}/{size}")
    public Result getWeekDaysData(@PathVariable("page") long page,
                                  @PathVariable("size") long size,
                                  @RequestBody(required = false) Tbl_full_body_workouts_list req) {

//        this.getBodytxt(request);
//        String weekName="1";
        String weekName = req.getWeek_name() + "";
        IPage<Tbl_full_body_workouts_list> tbl_full_body_workouts_listIPage = tbl_full_body_workouts_listService.getWeekDaysData(page, size, weekName);
        return Result.ok(tbl_full_body_workouts_listIPage);
    }

}
