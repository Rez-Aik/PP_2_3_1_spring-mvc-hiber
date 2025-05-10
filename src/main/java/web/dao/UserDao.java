package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
