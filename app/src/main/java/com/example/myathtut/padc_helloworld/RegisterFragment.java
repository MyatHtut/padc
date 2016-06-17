package com.example.myathtut.padc_helloworld;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by myathtut on 6/11/16.
 */
public class RegisterFragment extends Fragment {
    private String[] array_spinner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View view=inflater.inflate(R.layout.fragment_register,container,false);
        String [] values =
                {"Myanmar","UK","UAE","Spain","Singapore"};
        final Spinner spinner = (Spinner) view.findViewById(R.id.sp_country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        final EditText editusername=(EditText) view.findViewById(R.id.et_username);
        final EditText editpasword=(EditText) view.findViewById(R.id.et_password);
        final EditText editemail=(EditText) view.findViewById(R.id.et_email);
        final EditText editphone=(EditText) view.findViewById(R.id.phone);
        final  RadioGroup radioGroup=(RadioGroup) view.findViewById(R.id.rg_group);
//        final  RadioButton radioButton=(RadioButton) view.findViewById(R.id.male);

//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
//        {
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                // checkedId is the RadioButton selected
//
//                switch(checkedId) {
//                    case R.id.male:
//                        // switch to fragment 1
//                        break;
//                    case R.id.female:
//                        // Fragment 2
//                        break;
//                }
//            }
//        });
        Button button=(Button) view.findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strname=editusername.getText().toString();
                String strpassword=editpasword.getText().toString();
                String stremail=editemail.getText().toString();
                String strphone=editphone.getText().toString();
                String strspinner=spinner.getSelectedItem().toString();

//                int selectGenderId = radioGroup.getCheckedRadioButtonId();
                RadioButton rdbGender = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                String gender=(rdbGender != null) ?rdbGender.getText().toString() :"aa";

//                String gender = (rdbGender != null) ? rdbGender.getText().toString() : "others";
//                String gender = (rdbGender != null) ? rdbGender.getText().toString() : "others";



                Intent intent =new Intent(getActivity().getApplicationContext(),regsumeryActivity.class);

                intent.putExtra("name", strname);
                intent.putExtra("pwd", strpassword);
                intent.putExtra("email", stremail);
                intent.putExtra("phone", strphone);
                intent.putExtra("spinner", strspinner);
                intent.putExtra("gender",gender);
                startActivity(intent);
            }
        });

        return view;

    }
}
