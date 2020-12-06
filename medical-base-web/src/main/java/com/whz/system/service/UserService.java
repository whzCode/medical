package com.whz.system.service;

import java.util.List;

import com.whz.system.pojo.Menu;
import com.whz.system.pojo.Role;
import com.whz.system.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
public interface UserService extends IService<User> {
    /**
     * @Description 根据username获取个人信息
     * @Date 14:00 2020/12/6
     * @Param username
     * @return User
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
