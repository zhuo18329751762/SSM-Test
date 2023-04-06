package com.yangzhuo.factory;

import com.yangzhuo.dao.OrderDao;
import com.yangzhuo.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
