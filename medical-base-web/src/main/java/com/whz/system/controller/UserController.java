package com.whz.system.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.whz.response.Result;
import com.whz.system.pojo.User;
import com.whz.system.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author 卫宏哲
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/system/user")
@Api(value = "系统用户模块",tags = "系统用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUsers",method = RequestMethod.GET)
    @ApiOperation(value = "用户列表",notes = "查询所有用户信息")
    public Result findUsers(){
        List<User> list = userService.list();
        return Result.ok().data("users",list);
    }

    @GetMapping("/pageUserList")
    public Result pageUserList(@RequestParam(required = true,defaultValue = "1")Integer current,
                               @RequestParam(required = true,defaultValue = "7")Integer size){
        //对用户进行分页，泛型中注入的就是用户实体类
        Page<User> page = new Page<>(current,size);
        Page<User> userPage = userService.page(page);
        long total = userPage.getTotal();
        List<User> records = userPage.getRecords();
        return Result.ok().data("total",total).data("records",records);

    }

}

