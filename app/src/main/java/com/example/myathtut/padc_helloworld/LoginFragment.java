package com.example.myathtut.padc_helloworld;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class LoginFragment extends Fragment {
private String defaultusername;
public static final String BARG_USERNAME="dummy_username";
public static LoginFragment newInstance(String defaultusername)
{
    LoginFragment fragment=new LoginFragment();
    Bundle bundle=new Bundle();
    bundle.putString(LoginFragment.BARG_USERNAME,defaultusername);
    fragment.setArguments(bundle);

    return fragment;
}

    public LoginFragment() {
    }


    //to display data value in fragment
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getArguments();
        if (bundle !=null)
        {
            defaultusername=bundle.getString(LoginFragment.BARG_USERNAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

     View view=inflater.inflate(R.layout.fragment_home, container, false);
       final EditText editusername=(EditText) view.findViewById(R.id.et_username);
        editusername.setText(defaultusername);

        final EditText editpasword=(EditText) view.findViewById(R.id.et_password);



        Button button=(Button) view.findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String strname=editusername.getText().toString();
                 String strpassword=editpasword.getText().toString();
//                Toast.makeText(getContext(),"Hi thar gyi "+strname+"-"+strpassword,Toast.LENGTH_LONG).show();
                Intent intentToLogin=LoginSummeryActivity.newIntent(strname);
                startActivity(intentToLogin);

            }
        });



        return view;
    }
}
