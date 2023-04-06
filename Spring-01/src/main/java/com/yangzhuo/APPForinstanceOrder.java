package com.yangzhuo;

import com.yangzhuo.dao.OrderDao;
import com.yangzhuo.factory.OrderDaoFactory;

public class APPForinstanceOrder {
    public static void main(String[] args) {
        //通过静态工厂创建对象
        OrderDao orderDao= OrderDaoFactory.getOrderDao();
        orderDao.save();
    }
}
