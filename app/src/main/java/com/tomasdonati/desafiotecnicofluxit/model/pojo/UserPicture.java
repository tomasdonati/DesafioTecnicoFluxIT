package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserPicture implements Serializable {

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
