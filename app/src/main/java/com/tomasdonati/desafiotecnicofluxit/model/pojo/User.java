package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {

    @SerializedName("name")
    private UserFullName userFullName;
    @SerializedName("location")
    private UserLocation userLocation;
    @SerializedName("login")
    private UserLogin userLogin;
    @SerializedName("picture")
    private UserPicture userPicture;
    @SerializedName("email")
    private String userEmail;
    @SerializedName("cell")
    private String userPhoneNumber;
    @SerializedName("dob")
    private UserDOB userDOB;

    public User() {
    }

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

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public UserDOB getUserDOB() {
        return userDOB;
    }
}
