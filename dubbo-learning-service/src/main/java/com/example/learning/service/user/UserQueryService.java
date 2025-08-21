package com.example.learning.service.user;


import com.example.learning.domain.user.UserDTO;

public interface UserQueryService {
    /**
     * 根据订单Id查询订单信息
     * @param userId
     * @return
     */
    UserDTO queryByUserId(Integer userId);
}
