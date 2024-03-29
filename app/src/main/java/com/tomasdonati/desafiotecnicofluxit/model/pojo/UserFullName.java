package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserFullName implements Serializable {

    @SerializedName("title")
    private String userTitle;
    @SerializedName("first")
    private String userFirstName;
    @SerializedName("last")
    private String userLastName;

    public String getUserTitle() {
        return userTitle;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String generateFullName(){
        return userTitle + " " + userFirstName + " " + userLastName;
    }
}
