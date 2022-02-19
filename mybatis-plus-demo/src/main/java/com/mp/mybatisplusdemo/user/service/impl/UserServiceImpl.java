package com.mp.mybatisplusdemo.user.service.impl;

import com.mp.mybatisplusdemo.user.entity.User;
import com.mp.mybatisplusdemo.user.mapper.UserMapper;
import com.mp.mybatisplusdemo.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TX
 * @since 2022-02-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> getAll() {
        return this.baseMapper.getAll();
    }
}
