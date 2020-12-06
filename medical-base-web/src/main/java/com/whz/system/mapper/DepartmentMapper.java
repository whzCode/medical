package com.whz.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.whz.system.pojo.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-28
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

}
