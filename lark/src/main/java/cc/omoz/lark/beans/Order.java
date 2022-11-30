package cc.omoz.lark.beans;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {
    private String userId;
    private String orderId;

    public Order() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
