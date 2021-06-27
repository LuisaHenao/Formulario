package com.lh.ejemploclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etLoginName;
    private EditText etLoginPassword;
    private Button btnLoginSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void setContendView(){
        etLoginName = findViewById(R.id.txtUserName);
        etLoginPassword = findViewById(R.id.txtPassword);
        btnLoginSend = findViewById(R.id.btnLoginfb);
        btnLoginSend.setOnClickListener( this);
    }


    private void sendLogin(){

        String fullText = etLoginName.getText().toString();
        String fullPass = etLoginPassword.getText().toString();
        Toast.makeText(this,"hola "+ fullText,Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLoginfb){
            sendLogin();
            login();
        }


    }

    public void login(){

        String fullText = etLoginName.getText().toString();
        String fullPass = etLoginPassword.getText().toString();


        if(fullText.equals("Luisa") && fullPass.equals("123456789")){
            Toast.makeText(this, "BIENVENIDO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Usuario o Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}