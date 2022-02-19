package com.mp.mybatisplusdemo.user.mapper;

import com.mp.mybatisplusdemo.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author TX
 * @since 2022-02-17
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> getAll();
}
