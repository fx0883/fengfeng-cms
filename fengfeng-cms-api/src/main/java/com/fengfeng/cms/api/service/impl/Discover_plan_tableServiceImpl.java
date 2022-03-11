package com.fengfeng.cms.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengfeng.cms.api.entity.Discover_plan_table;
import com.fengfeng.cms.api.mapper.Discover_plan_tableMapper;
import com.fengfeng.cms.api.service.IDiscover_plan_tableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
@Service
public class Discover_plan_tableServiceImpl extends ServiceImpl<Discover_plan_tableMapper, Discover_plan_table> implements IDiscover_plan_tableService {

    @Override
    public IPage<Discover_plan_table> search(long page, long size, Discover_plan_table req) {
        QueryWrapper query = null;
        if(req != null) {
            query = new QueryWrapper();
            if(req.getPlanId()!=null) {
                query.eq("planId", req.getPlanId());
            }
            if(StringUtils.isNotBlank(req.getPlanName())) {
                query.like("planName", req.getPlanName());
            }
            if(StringUtils.isNotBlank(req.getParentPlanId())) {
                query.eq("parentPlanId", req.getParentPlanId());
            }
            if(StringUtils.isNotBlank(req.getDiscoverCatName())) {
                query.eq("discoverCatName", req.getDiscoverCatName());
            }
        }
        // 封装分页对象
        IPage<Discover_plan_table> p = new Page<>(page ,size,0);
        IPage<Discover_plan_table> data = baseMapper.selectPage(p, query);
        return data;
    }
}
