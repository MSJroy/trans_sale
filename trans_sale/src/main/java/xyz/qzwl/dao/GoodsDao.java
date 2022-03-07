package xyz.qzwl.dao;

import xyz.qzwl.domain.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectGoods(Integer goodsId);
}
