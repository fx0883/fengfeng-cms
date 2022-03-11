package com.fengfeng.cms.api.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fengfeng.cms.api.entity.Tbl_full_body_workouts_list;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
public interface ITbl_full_body_workouts_listService extends IService<Tbl_full_body_workouts_list> {

    IPage<Tbl_full_body_workouts_list> getWeekDaysData(long page, long size, String strWeekName);
}
