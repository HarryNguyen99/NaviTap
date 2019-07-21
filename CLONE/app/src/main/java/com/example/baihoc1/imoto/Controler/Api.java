package com.example.baihoc1.imoto.Controler;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {
    @POST("Service/Login")
    Call<ResponseBody> getLogin(@Body Object object);
}
