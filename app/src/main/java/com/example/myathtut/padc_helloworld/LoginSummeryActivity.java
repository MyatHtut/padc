package com.example.myathtut.padc_helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LoginSummeryActivity extends AppCompatActivity {
private static final String IE_USERNAME="username";
private static final String IE_pwd="pwd";

    public static Intent newIntent(String username)
    {
        Context context=HelloWorldApp.getContext();
        Intent intentToLogin= new Intent(context,LoginSummeryActivity.class);
        intentToLogin.putExtra(IE_USERNAME,username);

        return intentToLogin;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_summery);
       TextView txtview=(TextView) findViewById(R.id.text);
       TextView txtview2=(TextView) findViewById(R.id.text2);

        Intent intentFromHome=getIntent();
        String username=intentFromHome.getStringExtra(IE_USERNAME);
        String pwd=intentFromHome.getStringExtra(IE_pwd);
//        Toast.makeText(getApplicationContext(),"User name "+username,Toast.LENGTH_LONG).show();
        txtview.setText(username);

    }



}
