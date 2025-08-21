package com.example.learning.service.impl.goods;

import com.alibaba.fastjson.JSON;
import com.example.learning.domain.goods.GoodsDTO;
import com.example.learning.service.goods.GoodsQueryService;
import org.springframework.stereotype.Service;

@Service
public class GoodsQueryServiceImpl implements GoodsQueryService {
    @Override
    public GoodsDTO queryByGoodsId(Integer goodsId) {
        System.out.println("开始模拟查询数据库");
        GoodsDTO goodsDTO = new GoodsDTO();
        goodsDTO.setGoodsId(1);
        goodsDTO.setGoodsName("手机");
        System.out.println("返回结果："+ JSON.toJSONString(goodsDTO));
        return goodsDTO;
    }
}
