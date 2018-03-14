package com.example.reem.myapplication.api;

/**
 * Created by Reem on 3/3/18.
 */

public class Client {
    public static final string BASE_URL = "http://api.themoviedb.org/3/";
    public static Retrofit retrofit=null;


    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .bulid();
        }
        return retrofit;
    }

}
