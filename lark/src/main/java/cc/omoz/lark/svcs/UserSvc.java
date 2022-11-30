package cc.omoz.lark.svcs;

import cc.omoz.lark.beans.Order;
import cc.omoz.lark.beans.User;

/**
 * @author ThinkTik
 */
public interface UserSvc {
    User userDetail(String userId);

    Order orderDetail(String userId);
}
