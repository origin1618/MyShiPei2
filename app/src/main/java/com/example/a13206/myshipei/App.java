package com.example.a13206.myshipei;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by 13206 on 2018/8/24.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        AutoLayoutConifg.getInstance().useDeviceSize();
        super.onCreate();
    }
}
