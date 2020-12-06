package com.whz.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.whz.system.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

}
