package web.crud.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.crud.SpringBoot.dao.UserDao;
import web.crud.SpringBoot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
