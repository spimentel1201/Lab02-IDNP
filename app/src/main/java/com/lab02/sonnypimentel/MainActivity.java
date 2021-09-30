package com.lab02.sonnypimentel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    EditText name,lastname,dni,phone,email,address,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.EditTextNames);
        lastname = (EditText)findViewById(R.id.EditTextLastNames);
        phone = (EditText)findViewById(R.id.EditTextPhoneNumber);
        dni = (EditText)findViewById(R.id.EditTextDNI);
        email = (EditText)findViewById(R.id.EditTextEmail);
        address = (EditText)findViewById(R.id.EditTextAddress);
        message = (EditText)findViewById(R.id.EditTextMessage);
    }

    public void register(View button){
        String namex = name.getText().toString();
        String lastnamex = lastname.getText().toString();
        String phonex = phone.getText().toString();
        String dnix = dni.getText().toString();
        String emailx = email.getText().toString();
        String addressx = address.getText().toString();
        String a = message.getText().toString();
        message.setText(namex);
        System.out.print("Bienvenido "+namex);
        Log.d(TAG,"El registro se ejecutó perfectamente.");
    }
}
