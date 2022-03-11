package com.fengfeng.cms.api.service.impl;

import com.fengfeng.cms.api.entity.Home_plan_table;
import com.fengfeng.cms.api.mapper.Home_plan_tableMapper;
import com.fengfeng.cms.api.service.IHome_plan_tableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
@Service
public class Home_plan_tableServiceImpl extends ServiceImpl<Home_plan_tableMapper, Home_plan_table> implements IHome_plan_tableService {

    @Override
    public List<Home_plan_table> getHomePlanData() {
        return baseMapper.selectList(null);
    }
}
