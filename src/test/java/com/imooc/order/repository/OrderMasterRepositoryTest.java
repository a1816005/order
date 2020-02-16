package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
public class OrderMasterRepositoryTest  extends OrderDetailRepositoryTest{

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave(){

        OrderMaster orderMaster = new OrderMaster();

        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("邱拯");
        orderMaster.setBuyerAddress("溪南");
        orderMaster.setBuyerOpenid("1111000");
        orderMaster.setBuyerPhone("123456");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());



        OrderMaster result = orderMasterRepository.save(orderMaster);

        Assert.assertTrue(result!=null);

    }

}