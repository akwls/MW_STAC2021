package com.stac2021.mwproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.stac2021.mwproject.network.RetrofitClient;
import com.stac2021.mwproject.network.ServiceApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import server_user_data.UserInfoResponse;

public class app extends Application {
    ServiceApi service;
    private static String userId;
    private static String userName;
    private UserInfoItem userInfoItem;
    @Override
    public void onCreate() {
        super.onCreate();
    }
    public UserInfoItem getUserInfoItem(){
        if(userInfoItem == null){
            userInfoItem = new UserInfoItem();
        }
        return userInfoItem;
    }

    public String getUserName(){
        return userInfoItem.name;
    }

    public static String getUserId(){
        return userId;
    }
    public static String setUserId(String id){
        return userId = id;
    }
    public static String setUserName(String name){
        return userName = name;
    }
}