package com.example.learning.service.goods;

import com.example.learning.domain.goods.GoodsDTO;

public interface GoodsQueryService {
    /**
     * 根据商品Id查询商品信息
     * @param goodsId
     * @return
     */
    GoodsDTO queryByGoodsId(Integer goodsId);
}
