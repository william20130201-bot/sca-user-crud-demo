package com.demo.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // BaseMapper自带：insert、deleteById、updateById、selectById、selectList
}