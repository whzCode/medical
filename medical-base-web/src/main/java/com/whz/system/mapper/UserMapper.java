package com.whz.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.whz.system.pojo.Menu;
import com.whz.system.pojo.Role;
import com.whz.system.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * @param username
     * @return User
     * @Description 根据username获取个人信息
     * @Date 14:00 2020/12/6
     */
    User getByName(String username);
    /**
     * @Description 查询用户所有权限
     * @Date 16:10 2020/12/6
     * @Param id
     * @return Menu
     */
    List<Menu> getMenuByUserId(Long userId);
    /**
     * @Description 查询用户所有角色
     * @Date 16:12 2020/12/6
     * @Param userId
     * @return Role
     */
    List<Role> getRoleByUserId(Long userId);

}
