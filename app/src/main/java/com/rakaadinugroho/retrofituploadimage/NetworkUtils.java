package com.rakaadinugroho.retrofituploadimage;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Raka Adi Nugroho on 11/26/16.
 *
 * @Github github.com/rakaadinugroho
 * @Contact nugrohoraka@gmail.com
 */

public interface NetworkUtils {
    @Multipart
    @POST("uppic")
    Call<Response> uploadImage(@Part("nip") RequestBody nip,
                               @Part MultipartBody.Part file);
}
