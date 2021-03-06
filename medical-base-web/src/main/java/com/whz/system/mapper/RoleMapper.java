package com.whz.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.whz.system.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
