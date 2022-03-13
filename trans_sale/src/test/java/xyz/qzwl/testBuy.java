package xyz.qzwl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.qzwl.service.GoodsService;

public class testBuy {
    @Test
    public void test() {
        String configLocation = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        GoodsService service = (GoodsService) context.getBean("GoodsService");
        service.buyGoods(1007,2);
    }
}
