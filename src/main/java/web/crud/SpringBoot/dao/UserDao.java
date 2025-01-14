package web.crud.SpringBoot.dao;

import java.util.List;
import web.crud.SpringBoot.model.User;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User getUser(long id);

    List<User> getAllUsers();
}
