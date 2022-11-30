package cc.omoz.lark.daos.mysql;

import cc.omoz.lark.beans.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User queryById(String userId);
}
