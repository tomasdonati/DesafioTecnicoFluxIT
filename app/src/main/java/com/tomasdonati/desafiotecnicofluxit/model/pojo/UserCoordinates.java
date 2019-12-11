package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

public class UserCoordinates {

    @SerializedName("latitude")
   private String userLatitude;
    @SerializedName("longitude")
   private String userLongitude;

    public String getUserLatitude() {
        return userLatitude;
    }

    public String getUserLongitude() {
        return userLongitude;
    }
}
