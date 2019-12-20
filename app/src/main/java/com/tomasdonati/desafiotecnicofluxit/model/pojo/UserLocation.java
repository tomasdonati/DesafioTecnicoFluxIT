package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserLocation implements Serializable {

    @SerializedName("city")
   private String userCity;
    @SerializedName("state")
   private String userState;
    @SerializedName("postcode")
   private String userPostcode;
    @SerializedName("coordinates")
   private UserCoordinates userCoordinates;

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
