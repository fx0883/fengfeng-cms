package com.fengfeng.cms.api.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fengfeng.cms.api.entity.Tbl_full_body_workouts_list;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fengfeng
 * @since 2022-03-11
 */
public interface Tbl_full_body_workouts_listMapper extends BaseMapper<Tbl_full_body_workouts_list> {
    IPage<Tbl_full_body_workouts_list> getWeekDaysData(IPage<Tbl_full_body_workouts_list> page,@Param("strWeekName") String strWeekName);

}
