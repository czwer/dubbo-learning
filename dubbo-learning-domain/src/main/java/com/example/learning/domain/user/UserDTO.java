package com.example.learning.domain.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
}
