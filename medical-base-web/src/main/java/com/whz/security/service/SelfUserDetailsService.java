package com.whz.security.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.whz.security.entity.SelfUserEntity;
import com.whz.system.pojo.User;
import com.whz.system.service.UserService;

/**
 * @Author 卫宏哲
 * @Date 2020/12/5 23:05
 * @Version 1.0
 */
@Component
public class SelfUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    /**
     * 查询用户信息
     * @Author 卫宏哲
     * @CreateTime 2019/9/13 17:23
     * @Param  username  用户名
     * @Return UserDetails SpringSecurity用户信息
     */
    @Override
    public SelfUserEntity loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        User user =userService.getByName(username);
        if (user!=null){
            // 组装参数
            SelfUserEntity selfUserEntity = new SelfUserEntity();
            BeanUtils.copyProperties(user,selfUserEntity);
            return selfUserEntity;
        }
        return null;
    }
}
