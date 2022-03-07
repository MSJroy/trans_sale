package xyz.qzwl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.qzwl.service.BuyGoodsService;

public class testBuy {

    @Test
    public void testBuy() {
        String configLocation = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        BuyGoodsService service = (BuyGoodsService) context.getBean("buyService");
        service.buy(1003,2);
    }

}
