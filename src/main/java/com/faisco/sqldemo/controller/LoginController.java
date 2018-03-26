package com.faisco.sqldemo.controller;

import com.faisco.sqldemo.model.User;
import com.faisco.sqldemo.service.LoginService;
import com.faisco.sqldemo.util.Result;
import com.faisco.sqldemo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/doLogin")
    public Result doLogin(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        try {
            List<User> userList = loginService.doLogin(userName, passWord);
            return ResultUtil.success(userList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(500, "登录错误");
        }
    }
}
