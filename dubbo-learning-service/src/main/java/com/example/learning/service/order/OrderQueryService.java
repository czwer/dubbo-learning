package com.example.learning.service.order;

import com.example.learning.domain.order.OrderDTO;

public interface OrderQueryService {
    /**
     * 根据订单Id查询订单信息
     * @param orderId
     * @return
     */
    OrderDTO queryByOrderId(Integer orderId);
}
