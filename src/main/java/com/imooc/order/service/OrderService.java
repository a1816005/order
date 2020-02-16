package com.imooc.order.service;

import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDTO;
import org.springframework.stereotype.Service;


public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
