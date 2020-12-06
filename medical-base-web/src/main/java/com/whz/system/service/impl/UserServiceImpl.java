package com.whz.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.whz.system.pojo.Menu;
import com.whz.system.pojo.Role;
import com.whz.system.pojo.User;
import com.whz.system.mapper.UserMapper;
import com.whz.system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * @param username
     * @return User
     * @Description 根据username获取个人信息
     * @Date 14:00 2020/12/6
     */
    @Override
    public User getByName(String username) {
        return userMapper.getByName(username);
    }

    /**
     * @param userId
     * @return Menu
     * @Description 查询用户所有权限
     * @Date 16:10 2020/12/6
     * @Param id
     */
    @Override
    public List<Menu> getMenuByUserId(Long userId) {
        return userMapper.getMenuByUserId(userId);
    }

    /**
     * @param userId
     * @return Role
     * @Description 查询用户所有角色
     * @Date 16:12 2020/12/6
     * @Param userId
     */
    @Override
    public List<Role> getRoleByUserId(Long userId) {
        return userMapper.getRoleByUserId(userId);
    }
}
