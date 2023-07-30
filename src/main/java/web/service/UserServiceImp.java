package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDaoImp userDaoImp;

    @Autowired
    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }
    @Override
    public List<User> findAll(){
        return userDaoImp.findAll();
    }
    @Override
    public User find(long id){
        return userDaoImp.find(id);
    }
    @Override
    public void save(User user){
        userDaoImp.save(user);
    }
    @Override
    public void delete(long uid){
        userDaoImp.delete(uid);
    }
    @Override
    public void edit(long id, User user){
        userDaoImp.update(id, user);
    }

}
