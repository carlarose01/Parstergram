package com.example.parstergram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("p0pBwValBilX2ipKfiSAKtCK2XOlzEtkpw7FUmvN")
                .clientKey("tFtJuTWPf1X8oz8D6XVb7Cg3XfZxCTUEPhznkHgb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
