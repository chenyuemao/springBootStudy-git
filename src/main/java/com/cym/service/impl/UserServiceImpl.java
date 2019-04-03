package com.cym.service.impl;

import com.cym.dao.UsersMapper;
import com.cym.model.Users;
import com.cym.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UsersMapper usersMapper;


    @Override
    public boolean login(String userName, String password) {
        Users users = usersMapper.findByUsernameAndPasswd(userName,password);
        return users != null;
    }

    @Override
    @Transactional
    public boolean register(String userName, String password) {
        Users users = new Users();
        users.setUserName(userName);
        users.setPassword(password);

        int rt = usersMapper.insertSelective(users);
        return rt > 0;
    }


}
