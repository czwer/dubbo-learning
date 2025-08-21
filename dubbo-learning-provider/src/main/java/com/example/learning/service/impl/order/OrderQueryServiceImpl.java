package com.example.learning.service.impl.order;

import com.alibaba.fastjson.JSON;
import com.example.learning.domain.order.OrderDTO;
import com.example.learning.service.order.OrderQueryService;
import org.springframework.stereotype.Service;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {

    @Override
    public OrderDTO queryByOrderId(Integer orderId) {
        System.out.println("开始模拟查询数据库");
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId(1);
        orderDTO.setOrderName("手机");
        System.out.println("返回结果："+JSON.toJSONString(orderDTO));
        return orderDTO;
    }
}
