package com.fengfeng.cms.api.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fengfeng.cms.api.entity.Discover_plan_table;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
public interface IDiscover_plan_tableService extends IService<Discover_plan_table> {
    IPage<Discover_plan_table> search(long page, long size, Discover_plan_table req);
}
