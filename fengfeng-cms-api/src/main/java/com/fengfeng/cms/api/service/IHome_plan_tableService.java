package com.fengfeng.cms.api.service;

import com.fengfeng.cms.api.entity.Home_plan_table;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
public interface IHome_plan_tableService extends IService<Home_plan_table> {

    public List<Home_plan_table> getHomePlanData();
}
