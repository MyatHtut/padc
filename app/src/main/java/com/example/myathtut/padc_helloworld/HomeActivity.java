package com.example.myathtut.padc_helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements ViewFragment.controllerView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG","HomeACtivity-OnCreate");
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

            }
        });

//        LoginFragment fragment=new LoginFragment();

        if(findViewById(R.id.fl_container2)!=null) {
            RegisterFragment fragment = new RegisterFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container2, fragment)
                    .commit();
        }
        LoginFragment fragment2=new LoginFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment2)
                .commit();

        Button btnlogin=(Button) findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginFragment fragment=LoginFragment.newInstance("dummy_username");

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container,fragment)
                        .commit();
            }
        });

        Button btnregister=(Button) findViewById(R.id.btn_register);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterFragment fragment=new RegisterFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container,fragment)
                        .commit();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","HomeACtivity-OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","HomeACtivity-OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","HomeACtivity-OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","HomeACtivity-OnStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("sample_key", "sample_value");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void OnLoginperform() {
        Toast.makeText(HomeActivity.this,"Login",Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnRegisterperform() {

    }
}
