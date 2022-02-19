package com.mp.mybatisplusdemo.user.controller;


import com.mp.mybatisplusdemo.user.entity.User;
import com.mp.mybatisplusdemo.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TX
 * @since 2022-02-17
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {
    @Resource
    private IUserService userService;

    @ApiOperation(value = "按照用户id查询")
    @GetMapping(value = "/querById/{id}")
    public User querById(@PathVariable("id") Long id){
        User user = userService.getById(id);
        return user;
    }

    @GetMapping(value = "/list")
    public List<User> userList(){
       return userService.getAll();
    }
}
