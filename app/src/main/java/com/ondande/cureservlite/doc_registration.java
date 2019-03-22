package com.ondande.cureservlite;

import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.szagurskii.patternedtextwatcher.PatternedTextWatcher;

public class doc_registration extends AppCompatActivity {

    MaterialEditText edt_name;
    MaterialEditText edt_surname;
    MaterialEditText edt_phone;
    MaterialEditText edt_address;
    MaterialEditText edt_birth;
    MaterialEditText edt_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_registration);
        Log.d("CHANGE","DOC CHANGE");

        edt_name = (MaterialEditText)findViewById(R.id.edt_name);
        edt_surname = (MaterialEditText)findViewById(R.id.edt_surname);
        edt_phone = (MaterialEditText)findViewById(R.id.edt_phone);
        edt_address = (MaterialEditText)findViewById(R.id.edt_address);
        edt_birth = (MaterialEditText)findViewById(R.id.edt_birth);
        edt_position = (MaterialEditText)findViewById(R.id.edt_position);

        MaterialButton btn_conf_doc = (MaterialButton)findViewById(R.id.btn_conf_doc);

        edt_birth.addTextChangedListener(new PatternedTextWatcher("####-##-##"));

    }
}
