package com.ondande.cureservlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user_sign_up extends AppCompatActivity {

    Button btn_doc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
        btn_doc = (Button)findViewById(R.id.btn_doc);
        btn_doc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent reg;
                reg = new Intent(user_sign_up.this,doc_registration.class);
                startActivity(reg);

            }
        });
//        findViewById(R.id.btn_patient).setOnClickListener(this);
    }


//    @Override
//    public void onClick(View view) {
//
//        switch (view.getId())
//        {
//            case R.id.btn_doc:
//                startDocReg();
//                break;
//
//            case R.id.btn_patient:
//                startPatientReg();
//                break;
//
//        }
//
//    }
//
//    public void startDocReg(){
//
//        Intent reg;
//        reg = new Intent(user_sign_up.this,doc_registration.class);
//        startActivity(reg);
//
//    }

    public void startPatientReg(){

        Intent reg;
        reg = new Intent(user_sign_up.this,patient_registration.class);
        startActivity(reg);

    }

}
