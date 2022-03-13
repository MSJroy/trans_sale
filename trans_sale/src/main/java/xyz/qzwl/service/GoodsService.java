package xyz.qzwl.service;

public interface GoodsService {
    public void addGoods(Integer goodsId,Integer amount,String name,Integer price);
    public void editGoods(Integer goodsId,Integer amount,String name,Integer price);
    public void deleteGoods(Integer goodsId);
    public void buyGoods(Integer goodsId,Integer amount);
}
