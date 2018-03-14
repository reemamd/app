package com.example.reem.myapplication.api;

import com.example.reem.myapplication.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Reem on 3/3/18.
 */

public class Service {

    @GET("movie/popular")
    Call <MoviesResponse> getPopularMovies (@Query ("api_key")String apiKey);


}
