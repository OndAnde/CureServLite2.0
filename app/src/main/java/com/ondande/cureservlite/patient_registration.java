package com.ondande.cureservlite;

import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.szagurskii.patternedtextwatcher.PatternedTextWatcher;

public class patient_registration extends AppCompatActivity {

    MaterialEditText edt_name;
    MaterialEditText edt_surname;
    MaterialEditText edt_phone;
    MaterialEditText edt_address;
    MaterialEditText edt_birth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);

        edt_name = (MaterialEditText)findViewById(R.id.edt_name);
        edt_surname = (MaterialEditText)findViewById(R.id.edt_surname);
        edt_phone = (MaterialEditText)findViewById(R.id.edt_phone);
        edt_address = (MaterialEditText)findViewById(R.id.edt_address);
        edt_birth = (MaterialEditText)findViewById(R.id.edt_birth);

        MaterialButton btn_conf_patient = (MaterialButton)findViewById(R.id.btn_conf_patient);

        edt_birth.addTextChangedListener(new PatternedTextWatcher("####-##-##"));
    }
}
