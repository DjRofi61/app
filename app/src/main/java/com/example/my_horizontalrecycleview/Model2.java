package com.example.my_horizontalrecycleview;

public class Model2 {
    private int profileImage;
    private String userName;
    private String spécialité;
    private String userDesc;

    public Model2(int profileImage, String userName, String spécialité) {
        this.profileImage = profileImage;
        this.userName = userName;
        this.spécialité = spécialité;

    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
