package com.jdkgroup.createjson.general;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jdkgroup.createjson.model.login.ModelLogin;
import com.jdkgroup.createjson.model.login.ModelLoginData;

/**
 * Created by LENOVO on 3/1/2017.
 */

public class GeneralImplement {

    private Gson gson;

    private Gson SwitchGson(int param) {
        switch (param) {
            case 1:
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("M/d/yy hh:mm a");
                gson = gsonBuilder.create();
                return gson;

            case 2: //FIRST CHARACTER UPPER CAMEL
                gson = new GsonBuilder().
                        disableHtmlEscaping().
                        setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                        setPrettyPrinting().serializeNulls().
                        create();
                return gson;

            default:
                break;
        }

        return null;
    }

    public String selectData(int function) {
        switch (function) {
            case 1: //LoginData
                gson = SwitchGson(1);

                ModelLoginData modelLoginData = new ModelLoginData(1, "JDKKamal", "email", "address", "image");
                ModelLogin modelLogin = new ModelLogin(1, modelLoginData);

                return gson.toJson(modelLogin);
        }

        return null;
    }
}
