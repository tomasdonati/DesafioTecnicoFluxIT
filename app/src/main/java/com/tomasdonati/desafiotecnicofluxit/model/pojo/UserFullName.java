package com.tomasdonati.desafiotecnicofluxit.model.pojo;

public class UserFullName {

    private String userTitle;
    private String userFirstName;
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
