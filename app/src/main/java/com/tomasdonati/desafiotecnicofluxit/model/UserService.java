package com.tomasdonati.desafiotecnicofluxit.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {

    @GET("https://randomuser.me/api/")
    Call<UserContainer> bringUsers(@Query("results") String query);

}
