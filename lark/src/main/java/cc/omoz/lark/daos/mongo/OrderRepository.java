package cc.omoz.lark.daos.mongo;

import cc.omoz.lark.beans.Order;

/**
 * @author ThinkTik
 */

public interface OrderRepository {
    Order queryById(String orderId);
}
