package com.faisco.sqldemo.service;

import com.faisco.sqldemo.model.User;
import java.util.List;

public interface LoginService {
    public List<User> doLogin(String userName, String passWord) throws Exception;
}
