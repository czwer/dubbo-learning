package com.example.learning.service.impl.user;

import com.alibaba.fastjson.JSON;
import com.example.learning.domain.user.UserDTO;
import com.example.learning.service.user.UserQueryService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class UserQueryServiceImpl implements UserQueryService {
    @Override
    public UserDTO queryByUserId(Integer userId) {
        System.out.println("开始模拟查询数据库");
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(1);
        userDTO.setUserName("hello");
        System.out.println("返回结果："+ JSON.toJSONString(userDTO));
        return userDTO;
    }
}
