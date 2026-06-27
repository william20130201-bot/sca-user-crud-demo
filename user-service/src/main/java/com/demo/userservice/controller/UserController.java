package com.demo.userservice.controller;


import com.demo.userservice.common.Result;
import com.demo.userservice.entity.User;
import com.demo.userservice.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    // 1.新增用户 POST
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody User user){
        boolean save = userService.save(user);
        return Result.success(save);
    }

    // 2.根据id查询 GET
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return Result.success(user);
    }

    // 3.查询所有 GET
    @GetMapping("/list")
    public Result<List<User>> list(){
        List<User> list = userService.list();
        return Result.success(list);
    }

    // 4.修改用户 PUT
    @PutMapping("/update")
    public Result<Boolean> update(@RequestBody User user){
        boolean b = userService.updateById(user);
        return Result.success(b);
    }

    // 5.删除用户 DELETE
    @DeleteMapping("/{id}")
    public Result<Boolean> delete(@PathVariable Integer id){
        boolean b = userService.removeById(id);
        return Result.success(b);
    }
}