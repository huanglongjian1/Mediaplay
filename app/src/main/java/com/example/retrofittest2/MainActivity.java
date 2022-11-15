package com.example.retrofittest2;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView artistsname;
    ImageView icon;
    TextView music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        artistsname = findViewById(R.id.artistsname);
        icon = findViewById(R.id.icon);
        music = findViewById(R.id.music);


        getData();
    }

    String TAG = MainActivity.class.getSimpleName();

    private void getData() {
        Api api = retrofit.create(Api.class);
        Call<Data> dataCall = api.getJsonData("新歌榜", "json");


        dataCall.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                String str = null;
                str = response.body().getData().getPicurl() + "\n" + response.body().getData().getUrl()
                        + "\n" + response.body().getData().getName();
                Log.e(TAG, str);
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });


    }

    //构建Retrofit实例
    Retrofit retrofit = new Retrofit.Builder()
            //设置网络请求BaseUrl地址
            .baseUrl("https://api.uomg.com/")
            //设置数据解析器
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}