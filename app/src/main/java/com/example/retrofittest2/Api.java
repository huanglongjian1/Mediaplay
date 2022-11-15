package com.example.retrofittest2;



import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    //get请求
    @GET("api/rand.music")
    Call<Data> getJsonData(@Query("sort") String sort, @Query("format") String format);
}