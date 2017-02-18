package com.example.lloyd.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by lloyd on 18-Feb-17.
 */

public class FireApp extends Application {
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
