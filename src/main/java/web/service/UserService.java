package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User find(long id);
    void save(User user);
    void delete(long uid);
    void edit(long id, User user);
}
