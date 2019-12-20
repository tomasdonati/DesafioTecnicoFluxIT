package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserLogin implements Serializable {

    @SerializedName("username")
   private String userUsername;
    @SerializedName("password")
   private String userPassword;

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
