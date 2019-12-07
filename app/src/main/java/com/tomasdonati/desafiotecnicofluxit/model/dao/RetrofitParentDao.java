package com.tomasdonati.desafiotecnicofluxit.model.dao;

import com.tomasdonati.desafiotecnicofluxit.model.service.UserService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitParentDao {

    private Retrofit retrofit;
    protected UserService userService;

    public RetrofitParentDao(String baseUrl){
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        userService = retrofit.create(UserService.class);
    }
}
