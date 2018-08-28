package com.faisco.sqldemo.service.impl;

import com.faisco.sqldemo.model.User;
import com.faisco.sqldemo.repository.UserRepository;
import com.faisco.sqldemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> doLogin(String userName, String passWord) throws Exception {
        return userRepository.findByUserAndPwd(userName, passWord);
    }
}
