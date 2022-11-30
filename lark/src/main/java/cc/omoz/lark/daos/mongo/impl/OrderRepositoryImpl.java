package cc.omoz.lark.daos.mongo.impl;

import cc.omoz.lark.beans.Order;
import cc.omoz.lark.daos.mongo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Order queryById(String orderId) {
        Query query = new Query(Criteria.where("orderId").is(orderId));
        Order order = mongoTemplate.findOne(query, Order.class);
        return order;
    }
}
