package com.jdkgroup.createjson.model.login;

/**
 * Created by LENOVO on 3/1/2017.
 */

public class ModelLoginData
{
    private int id;
    private String username, emailid, address, image;

    public ModelLoginData(int id, String username, String emailid, String address, String image) {
        this.id = id;
        this.username = username;
        this.emailid = emailid;
        this.address = address;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
