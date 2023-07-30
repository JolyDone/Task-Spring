package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User find(long id);
    void save(User user);
    void delete(long uid);
    void update(long id, User user);
}
