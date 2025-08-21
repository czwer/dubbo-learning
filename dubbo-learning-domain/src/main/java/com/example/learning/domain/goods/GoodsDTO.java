package com.example.learning.domain.goods;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class GoodsDTO implements Serializable {
    /**
     * 商品ID
     */
    private Integer goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
}
