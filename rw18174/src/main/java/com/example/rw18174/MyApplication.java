package com.example.rw18174;

import android.app.Application;

import com.mob.MobSDK;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
    }
}
