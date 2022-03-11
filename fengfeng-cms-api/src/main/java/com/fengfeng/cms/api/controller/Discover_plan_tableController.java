package com.fengfeng.cms.api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fengfeng.cms.api.entity.Discover_plan_table;
import com.fengfeng.cms.api.service.IDiscover_plan_tableService;
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
@RequestMapping("/api/discover_plan_table")
public class Discover_plan_tableController {
    @Autowired
    private IDiscover_plan_tableService discover_plan_tableService;

    @PostMapping("/list/search/{page}/{size}")
    public Result search(@PathVariable("page") long page,
                         @PathVariable("size") long size,
                         @RequestBody(required = false) Discover_plan_table req) {
        IPage<Discover_plan_table> discoverPlanTableIPage = discover_plan_tableService.search(page, size, req);
        return Result.ok(discoverPlanTableIPage);
    }
}
