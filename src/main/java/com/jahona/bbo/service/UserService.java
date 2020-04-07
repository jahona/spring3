package com.jahona.bbo.service;

import com.jahona.bbo.dao.UserDAO;
import com.jahona.bbo.dto.user.User;
import com.jahona.bbo.dto.exception.ErrorResponse;
import com.jahona.bbo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserService {
    @Autowired
    UserDAO userDao;

    public List<User> getUserList() throws Exception {
        return userDao.getList();
    }

    public User createUser(User user) throws Exception {
        userDao.create(user);
        User selectUser = userDao.get(user.getId());

        return selectUser;
    }

    public User getUser(int id) throws Exception {
        User selectUser = userDao.get(id);

        if (selectUser == null) {
            throw new NotFoundException(new ErrorResponse("no resource", 0));
        }

        return selectUser;
    }

    public User updateUser(User user) throws Exception {
        User selectUser = userDao.get(user.getId());

        if(selectUser == null) {
            throw new NotFoundException(new ErrorResponse("no resource", 0));
        }

        userDao.update(user);
        selectUser = userDao.get(user.getId());

        return selectUser;
    }

    public Map<String, Object> deleteUser(int id) throws Exception {
        User selectUser = userDao.get(id);

        if(selectUser == null) {
            throw new NotFoundException(new ErrorResponse("no resource", 0));
        }

        userDao.delete(id);

        return new HashMap<String, Object>() {{
            put("success", true);
        }};
    }
}