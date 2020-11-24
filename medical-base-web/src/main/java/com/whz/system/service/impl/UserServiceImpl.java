package com.whz.system.service.impl;

import com.whz.system.pojo.User;
import com.whz.system.mapper.UserMapper;
import com.whz.system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
