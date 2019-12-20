package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserDOB implements Serializable {

    @SerializedName("age")
    private String userAge;

    public String getUserAge() {
        return userAge;
    }
}
