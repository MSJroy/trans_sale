package xyz.qzwl.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.qzwl.dao.GoodsDao;
import xyz.qzwl.dao.SaleDao;
import xyz.qzwl.domain.Goods;
import xyz.qzwl.domain.Sale;
import xyz.qzwl.exception.NotEnoughException;
import xyz.qzwl.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {

    private GoodsDao goodsDao;
    private SaleDao saleDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {NotEnoughException.class, NullPointerException.class})
    @Override
    public void addGoods(Integer goodsId, Integer amount, String name, Integer price) {
        Goods goods = new Goods();
        goods.setAmount(amount);
        goods.setId(goodsId);
        goods.setPrice(price);
        goods.setName(name);
        goodsDao.insertGoods(goods);
    }

    @Override
    public void editGoods(Integer goodsId, Integer amount, String name, Integer price) {
        Goods goods = new Goods();
        goods.setAmount(amount);
        goods.setId(goodsId);
        goods.setPrice(price);
        goods.setName(name);
        goodsDao.editGoods(goods);
    }

    @Override
    public void deleteGoods(Integer goodsId) {
        goodsDao.deleteGoods(goodsId);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {NotEnoughException.class, NullPointerException.class})
    @Override
    public void buyGoods(Integer goodsId, Integer amount) {

        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(amount);
        saleDao.insertSale(sale);

        Goods goods = goodsDao.selectGoods(goodsId);

        if (goods == null) {
            throw new NullPointerException("无此商品");
        }
        if (goods.getAmount() < amount) {
            throw new NullPointerException("库存不足");
        }

        goods = new Goods();
        goods.setAmount(amount);
        goods.setId(goodsId);
        goodsDao.updateGoods(goods);
    }
}
