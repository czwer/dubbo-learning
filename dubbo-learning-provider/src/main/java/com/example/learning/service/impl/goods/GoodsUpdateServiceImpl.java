package com.example.learning.service.impl.goods;

import com.example.learning.domain.goods.GoodsDTO;
import com.example.learning.service.goods.GoodsUpdateService;
import org.springframework.stereotype.Service;

public class GoodsUpdateServiceImpl implements GoodsUpdateService {

    @Override
    public Integer createGoods(GoodsDTO goodsDTO) {
        System.out.println("开始模拟查询数据库");
        Integer goodsId = 1;
        System.out.println("返回商品Id："+goodsId);
        return goodsId;
    }
}
