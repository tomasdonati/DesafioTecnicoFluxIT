package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

public class User {


    @SerializedName("name")
    private UserFullName userFullName;
    @SerializedName("location")
    private UserLocation userLocation;
    @SerializedName("login")
    private UserLogin userLogin;
    @SerializedName("picture")
    private UserPicture userPicture;
    @SerializedName("gender")
    private String userGender;
    @SerializedName("email")
    private String userEmail;
    @SerializedName("cell")
    private String userPhoneNumber;


    public UserFullName getUserFullName() {
        return userFullName;
    }

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public UserPicture getUserPicture() {
        return userPicture;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
