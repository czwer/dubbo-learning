package com.example.learning.service.impl.goods;

import com.alibaba.fastjson.JSON;
import com.example.learning.domain.goods.GoodsDTO;
import com.example.learning.service.goods.GoodsQueryService;
import com.example.learning.service.user.UserQueryService;
import com.example.learning.service.warehouse.WarehouseQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsQueryServiceImpl implements GoodsQueryService {

    private UserQueryService userQueryService;

    private WarehouseQueryService warehouseQueryService;

    //依赖注入：方法参数注入
    @Autowired
    public void setupServices(UserQueryService userQueryService, WarehouseQueryService warehouseQueryService) {
        this.userQueryService = userQueryService;
        this.warehouseQueryService = warehouseQueryService;
    }


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
