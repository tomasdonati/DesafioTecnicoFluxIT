package com.tomasdonati.desafiotecnicofluxit.controller;

import com.tomasdonati.desafiotecnicofluxit.model.pojo.User;
import com.tomasdonati.desafiotecnicofluxit.model.dao.UserDao;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;

import java.util.List;

public class UserController {

    public void bringUsers(final ResultListener<List<User>> viewListener){
        UserDao userDao = new UserDao();
        userDao.bringUsers(new ResultListener<List<User>>() {
            @Override
            public void finish(List<User> result) {
                viewListener.finish(result);
            }
        });
    }

}
