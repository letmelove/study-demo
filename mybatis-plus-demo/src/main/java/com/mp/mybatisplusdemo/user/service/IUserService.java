package com.mp.mybatisplusdemo.user.service;

import com.mp.mybatisplusdemo.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author TX
 * @since 2022-02-17
 */
public interface IUserService extends IService<User> {
    List<User> getAll();
}
