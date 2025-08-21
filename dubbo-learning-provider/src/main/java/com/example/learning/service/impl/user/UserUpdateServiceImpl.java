package com.example.learning.service.impl.user;

import com.example.learning.domain.user.UserDTO;
import com.example.learning.service.user.UserUpdateService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class UserUpdateServiceImpl implements UserUpdateService {
    @Override
    public Integer createUser(UserDTO userDTO) {
        System.out.println("开始模拟保存数据库");
        Integer userId = 1;
        System.out.println("返回用户Id："+userId);
        return userId;
    }
}
