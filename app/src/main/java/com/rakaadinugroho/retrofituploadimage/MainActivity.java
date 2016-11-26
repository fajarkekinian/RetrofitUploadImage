package com.rakaadinugroho.retrofituploadimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String field_image  = "photo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String imagepath        = "Path of Image";
        String mynip            = "14650015";
        File file   = new File(imagepath);

        RequestBody nip         = RequestBody.create(MediaType.parse("text/plain"), mynip);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part photo= MultipartBody.Part.createFormData(field_image, file.getName(), requestBody);

        Retrofit retrofit       = new Retrofit.Builder()
                .baseUrl("http://api.kalau.web.id/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NetworkUtils service    = retrofit.create(NetworkUtils.class);
        Call<Response> call     = service.uploadImage(nip, photo);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                // Response Log
                Log.d("Keterangan : ", response.body().getKet());
                Log.d("Status   : ", response.body().getStatus());

                Toast.makeText(MainActivity.this, "Upload : "+response.body().getDirectory(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });

    }
}
