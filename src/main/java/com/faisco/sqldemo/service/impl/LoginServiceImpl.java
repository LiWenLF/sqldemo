package com.faisco.sqldemo.service.impl;

import com.faisco.sqldemo.model.User;
import com.faisco.sqldemo.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public List<User> doLogin(String userName, String passWord) throws Exception {
        return null;
    }
}
