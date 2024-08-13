package com.example.learnapi_andorid;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiService {
    @GET("api/Values")
    Call<List<String>> getValues();
}

