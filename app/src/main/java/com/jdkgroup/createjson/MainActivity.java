package com.jdkgroup.createjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jdkgroup.createjson.general.GeneralImplement;

public class MainActivity extends AppCompatActivity {

    private GeneralImplement generalImplement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generalImplement = new GeneralImplement();
        System.out.println("Login :: " + generalImplement.selectData(1));
        System.out.println("Single Array :: " + generalImplement.selectData(2));
    }
}

