package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

public class UserPicture {

    @SerializedName("large")
   private String userLargePicture;
    @SerializedName("medium")
   private String userMediumPicture;
    @SerializedName("thumbnail")
   private String userThumbnailPicture;

    public String getUserLargePicture() {
        return userLargePicture;
    }

    public String getUserMediumPicture() {
        return userMediumPicture;
    }

    public String getUserThumbnailPicture() {
        return userThumbnailPicture;
    }
}
