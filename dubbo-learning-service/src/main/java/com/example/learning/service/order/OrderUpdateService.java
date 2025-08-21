package com.example.learning.service.order;

import com.example.learning.domain.order.OrderDTO;

public interface OrderUpdateService {
    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    Integer createOrder(OrderDTO orderDTO);
}
