package com.example.test.mapper;

import com.example.test.entiy.User;

/**
 * @author chuhe
 * @Description
 * @date 2021/8/16 3:14 下午
 */
public interface UserMapper {
    User selectById(Integer id);
}
