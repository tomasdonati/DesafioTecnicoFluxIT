package com.tomasdonati.desafiotecnicofluxit.controller;

import com.tomasdonati.desafiotecnicofluxit.model.User;
import com.tomasdonati.desafiotecnicofluxit.model.UserDao;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;

import java.util.List;

public class UserController {

    public void bringUsers(String query, final ResultListener<List<User>> viewListener){
        UserDao userDao = new UserDao();
        userDao.bringUsers(query, new ResultListener<List<User>>() {
            @Override
            public void finish(List<User> result) {
                viewListener.finish(result);
            }
        });
    }

}
