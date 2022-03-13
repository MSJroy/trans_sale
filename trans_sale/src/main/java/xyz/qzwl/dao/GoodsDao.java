package xyz.qzwl.dao;

import xyz.qzwl.domain.Goods;

public interface GoodsDao {
    int insertGoods(Goods goods);
    int updateGoods(Goods goods);
    int editGoods(Goods goods);
    void deleteGoods(Integer goodsId);
    Goods selectGoods(Integer goodsId);
}
