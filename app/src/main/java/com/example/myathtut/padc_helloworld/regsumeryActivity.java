package com.example.myathtut.padc_helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class regsumeryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsumery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView editText=(TextView) findViewById(R.id.edit_show);
        String name=getIntent().getStringExtra("name");
        String pwd=getIntent().getStringExtra("pwd");
        String email=getIntent().getStringExtra("email");
        String phone=getIntent().getStringExtra("phone");
        String spinner=getIntent().getStringExtra("spinner");
        String gender=getIntent().getStringExtra("gender");



        String str="NAME : "+name+"\nPassword: "+pwd+"\nEmail: "+email+"\nPhone: "+phone+"\nCountry: "+spinner+"\nCountry: "+gender;
        editText.setText(str);



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
