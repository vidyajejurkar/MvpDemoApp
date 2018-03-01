package com.example.vidya.mvpdemoapp;

import android.app.Application;

import com.example.vidya.mvpdemoapp.data.DataManager;
import com.example.vidya.mvpdemoapp.data.SharedPrefsHelper;

/**
 * Created by Vidya on 3/1/2018.
 */

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}