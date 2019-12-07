package com.tomasdonati.desafiotecnicofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

public class UserPicture {

   private String userLargePicture;
   private String userMediumPicture;
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
