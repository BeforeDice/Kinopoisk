package com.example.moviesekz.ui.fav;

import com.example.moviesekz.Flower;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface FavAPI {
    @GET("/movies?filter=compilation")
    Call<List<Flower>> getData();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://cinema.areas.su/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
