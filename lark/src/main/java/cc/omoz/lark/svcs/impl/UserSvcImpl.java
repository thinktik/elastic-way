package cc.omoz.lark.svcs.impl;

import cc.omoz.lark.beans.Order;
import cc.omoz.lark.beans.User;
import cc.omoz.lark.daos.mongo.OrderRepository;
import cc.omoz.lark.daos.mysql.UserDao;
import cc.omoz.lark.svcs.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSvcImpl implements UserSvc {
    @Autowired
    private UserDao userDao;
    @Autowired
    private OrderRepository orderDao;

    @Override
    public User userDetail(String userId) {
        return userDao.queryById(userId);
    }

    @Override
    public Order orderDetail(String orderId) {
        return orderDao.queryById(orderId);
    }
}
