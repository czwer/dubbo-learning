package com.example.learning.service.goods;

import com.example.learning.domain.goods.GoodsDTO;

public interface GoodsUpdateService {
    /**
     * 创建商品
     * @param goodsDTO
     * @return
     */
    Integer createGoods(GoodsDTO goodsDTO);
}
