package com.example.learning.service.impl.order;

import com.example.learning.domain.order.OrderDTO;
import com.example.learning.service.order.OrderUpdateService;
import org.springframework.stereotype.Service;

@Service
public class OrderUpdateServiceImpl implements OrderUpdateService {
    @Override
    public Integer createOrder(OrderDTO orderDTO) {
        System.out.println("开始模拟保存数据库");
        Integer orderId = 1;
        System.out.println("返回订单Id："+orderId);
        return orderId;
    }
}
