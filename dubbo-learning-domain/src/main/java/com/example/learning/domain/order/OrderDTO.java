package com.example.learning.domain.order;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class OrderDTO implements Serializable {
    /**
     * 订单Id
     */
    private Integer orderId;
    /**
     * 订单名称
     */
    private String orderName;
}
