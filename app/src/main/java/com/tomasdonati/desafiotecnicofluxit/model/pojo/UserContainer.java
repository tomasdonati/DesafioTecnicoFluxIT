package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserContainer {

    @SerializedName("results")
    private List<User> userList;

    public UserContainer(List<User> userList){
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
