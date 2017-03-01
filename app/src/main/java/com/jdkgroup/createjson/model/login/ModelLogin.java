package com.jdkgroup.createjson.model.login;

/**
 * Created by LENOVO on 3/1/2017.
 */

public class ModelLogin
{
    private int messagecode;

    private ModelLoginData loginData;

    public ModelLogin(int messagecode, ModelLoginData loginData) {
        this.messagecode = messagecode;
        this.loginData = loginData;
    }

    public int getMessagecode() {
        return messagecode;
    }

    public void setMessagecode(int messagecode) {
        this.messagecode = messagecode;
    }

    public ModelLoginData getLoginData() {
        return loginData;
    }

    public void setLoginData(ModelLoginData loginData) {
        this.loginData = loginData;
    }
}
