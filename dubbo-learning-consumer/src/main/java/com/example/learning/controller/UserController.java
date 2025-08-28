package com.example.learning.controller;

import com.example.learning.domain.user.UserDTO;
import com.example.learning.service.user.UserQueryService;
import com.example.learning.service.user.UserUpdateService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    @DubboReference
    private UserUpdateService userUpdateService;
    @Autowired
    @DubboReference
    private UserQueryService userQueryService;

    /**
     * 创建用户
     */
    @ResponseBody
    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public Integer createUser(@RequestBody UserDTO userDTO) {
        return userUpdateService.createUser(userDTO);
    }

    /**
     * 查询用户
     */
    @ResponseBody
    @RequestMapping(value = "queryByUserId", method = RequestMethod.GET)
    public UserDTO queryByUserId(@RequestParam("userId")Integer userId) {
        return userQueryService.queryByUserId(userId);
    }


}
