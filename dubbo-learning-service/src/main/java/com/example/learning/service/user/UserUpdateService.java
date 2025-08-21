package com.example.learning.service.user;

import com.example.learning.domain.user.UserDTO;

public interface UserUpdateService {
    /**
     * 创建用户
     * @param userDTO
     * @return
     */
    Integer createUser(UserDTO userDTO);
}
