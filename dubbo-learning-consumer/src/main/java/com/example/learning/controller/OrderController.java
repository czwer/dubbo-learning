package com.example.learning.controller;

import com.example.learning.domain.order.OrderDTO;
import com.example.learning.service.order.OrderQueryService;
import com.example.learning.service.order.OrderUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderUpdateService orderUpdateService;
    @Autowired
    private OrderQueryService orderQueryService;

    /**
     * 创建订单
     */
    @ResponseBody
    @RequestMapping(value = "createOrder", method = RequestMethod.POST)
    public Integer createOrder(@RequestBody OrderDTO orderDTO) {
        return orderUpdateService.createOrder(orderDTO);
    }

    /**
     * 查询订单
     */
    @ResponseBody
    @RequestMapping(value = "queryByOrderId", method = RequestMethod.GET)
    public OrderDTO queryByOrderId(@RequestParam("orderId")Integer orderId) {
        return orderQueryService.queryByOrderId(orderId);
    }


}
