package com.example.learning.service.impl.order;

import com.alibaba.fastjson.JSON;
import com.example.learning.domain.order.OrderDTO;
import com.example.learning.service.goods.GoodsQueryService;
import com.example.learning.service.order.OrderQueryService;
import com.example.learning.service.user.UserQueryService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {
    //依赖注入：字段注入
    @Autowired
    private GoodsQueryService goodsQueryService;
    //依赖注入：字段注入
    @Resource
    private UserQueryService userQueryService;

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
