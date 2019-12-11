package com.tomasdonati.desafiotecnicofluxit.model.dao;

import android.util.Log;

import com.tomasdonati.desafiotecnicofluxit.model.pojo.User;
import com.tomasdonati.desafiotecnicofluxit.model.pojo.UserContainer;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDao extends RetrofitParentDao {

    public static final String BASE_URL = "https://randomuser.me/api/";

    public UserDao() {
        super(BASE_URL);
    }

    public void bringUsers( final ResultListener<List<User>> controllerListener){
        Call<UserContainer> call = userService.bringUsers();

        call.enqueue(new Callback<UserContainer>() {
            @Override
            public void onResponse(Call<UserContainer> call, Response<UserContainer> response) {
                UserContainer userContainer = response.body();
                controllerListener.finish(userContainer.getUserList());
            }

            @Override
            public void onFailure(Call<UserContainer> call, Throwable t) {
                Log.d("ddd","dd");
            }
        });
    }


}
