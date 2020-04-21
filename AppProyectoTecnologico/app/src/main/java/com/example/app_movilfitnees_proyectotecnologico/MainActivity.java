package com.example.app_movilfitnees_proyectotecnologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtuser, edtpass;
    Button login, url;

    private static String usuario = "admin";
    private static String password = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtuser = (EditText) findViewById(R.id.edtUser);
        edtpass = (EditText) findViewById(R.id.edtPassword);
        login = (Button) findViewById(R.id.btnLogin);
        url = (Button)findViewById(R.id.btnUrl);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edtuser.getText().toString().trim().length() == 0 && edtpass.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Ingrese un usuario y contraseña", Toast.LENGTH_SHORT).show();
                }else {

                    if(edtuser.getText().toString().trim().equals(usuario) && edtpass.getText().toString().trim().equals(password)){

                        Intent i = new Intent(MainActivity.this, Menu.class);
                        startActivity(i);
                    }else {
                        Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.pe"));   //Ejemplo de url
                startActivity(i);
            }
        });

    }
}
