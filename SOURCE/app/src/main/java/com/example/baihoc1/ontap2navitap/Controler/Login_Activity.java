package com.example.baihoc1.ontap2navitap.Controler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.baihoc1.ontap2navitap.Model.Login;
import com.example.baihoc1.ontap2navitap.R;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Login_Activity extends AppCompatActivity {

    EditText edtLogin;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        login();


    }

    private void login() {
    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final String sdtLogin = edtLogin.getText().toString();
            GetLogin getLogin = new GetLogin
                    ("0387490078", "hjgjhg", "android");
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://45.118.144.19:1904/api/")
                    .build();
            retrofit.create(Api.class).getLogin(getLogin).enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    try {
                        String strJson =response.body().string();
                        Gson gson = new Gson();
                        Login login = gson.fromJson(strJson, Login.class);
                        String phone = login.getLoginResultt().getPhone().toString();
                        if (sdtLogin.equals(phone)){
                            Intent intent = new Intent
                                    (Login_Activity.this, MainActivity.class);
                            intent.putExtra("user",login);
                            startActivity(intent);
                            finish();
                        }
                        else {
                            Toast.makeText(Login_Activity.this,
                                    "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {

                }
            });

        }
    });

    }

    private void init() {
    edtLogin = findViewById(R.id.edt_login);
    btnLogin = findViewById(R.id.btn_login);
    }

    class GetLogin {
        String PhoneNumber, DeviceID, Os;
        public GetLogin(String phoneNumber, String deviceID, String os) {
            PhoneNumber = phoneNumber;
            DeviceID = deviceID;
            Os = os;
        }
    }
}
