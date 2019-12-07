package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

public class UserLocation {

   private String userStreet;
   private String userCity;
   private String userState;
   private String userPostcode;
   private UserCoordinates userCoordinates;

    public String getUserStreet() {
        return userStreet;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserState() {
        return userState;
    }

    public String getUserPostcode() {
        return userPostcode;
    }

    public UserCoordinates getUserCoordinates() {
        return userCoordinates;
    }
}
