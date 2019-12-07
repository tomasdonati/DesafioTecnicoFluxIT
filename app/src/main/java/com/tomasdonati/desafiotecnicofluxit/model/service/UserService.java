package com.tomasdonati.desafiotecnicofluxit.model.service;

import com.tomasdonati.desafiotecnicofluxit.model.pojo.UserContainer;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("?results=20")
    Call<UserContainer> bringUsers();

}
