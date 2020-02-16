package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Resource
    private  OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234");
        orderDetail.setOrderId("1234");
        orderDetail.setProductIcon("http://xxx.com");
        orderDetail.setProductName("xxxx");
        orderDetail.setProductPrice(new BigDecimal(2.5));
        orderDetail.setProductQuantity(3);
        orderDetail.setProductId("1111111");

        OrderDetail result = orderDetailRepository.save(orderDetail);

        Assert.assertTrue(result!=null);

    }

}