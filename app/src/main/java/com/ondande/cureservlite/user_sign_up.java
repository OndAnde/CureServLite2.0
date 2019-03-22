package com.ondande.cureservlite;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.szagurskii.patternedtextwatcher.PatternedTextWatcher;

public class user_sign_up extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        findViewById(R.id.btn_doc).setOnClickListener(this);
        findViewById(R.id.btn_patient).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btn_doc:
                startDocReg();
                break;

            case R.id.btn_patient:
                startPatientReg();
                break;

        }

    }

    public void startDocReg(){

        Intent reg;
        reg = new Intent(user_sign_up.this,doc_registration.class);
        this.startActivity(reg);

    }

    public void startPatientReg(){

        Intent reg;
        reg = new Intent(user_sign_up.this,patient_registration.class);
        this.startActivity(reg);

    }
}

