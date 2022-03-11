package com.fengfeng.cms.api.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengfeng.cms.api.entity.Tbl_full_body_workouts_list;
import com.fengfeng.cms.api.mapper.Tbl_full_body_workouts_listMapper;
import com.fengfeng.cms.api.service.ITbl_full_body_workouts_listService;
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
public class Tbl_full_body_workouts_listServiceImpl extends ServiceImpl<Tbl_full_body_workouts_listMapper, Tbl_full_body_workouts_list> implements ITbl_full_body_workouts_listService {

    @Override
    public IPage<Tbl_full_body_workouts_list> getWeekDaysData(long page, long size, String strWeekName) {

        IPage<Tbl_full_body_workouts_list> data =
                baseMapper.getWeekDaysData(new Page<Tbl_full_body_workouts_list>(page, size), strWeekName);

        return data;
    }
}
