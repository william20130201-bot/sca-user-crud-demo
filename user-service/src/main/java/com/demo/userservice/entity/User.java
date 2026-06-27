package com.demo.userservice.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体类：对应数据库t_user表
 */
@Data // 自动生成get/set方法
@TableName("t_user") // 绑定数据库表名
public class User {
    // 主键ID，自增策略
    @TableId(type = IdType.AUTO)
    private Integer id;
    // 用户名
    private String username;
    // 年龄
    private Integer age;
    // 邮箱
    private String email;
}