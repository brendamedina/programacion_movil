package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button btnLoginFacebook;
    private Button getBtnSignInNetflix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginFacebook = findViewById(R.id.btn_login_facebook);
        getBtnSignInNetflix = findViewById(R.id.btn_sign_in_netflix);


        btnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        getBtnSignInNetflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginNetflixActivity.class);
                startActivity(intent);
            }
        });

    }




        /*if(view.getId() == R.id.btn_accept){
            tvSaludo.setText("Cambiando texto desde boton");
        }
        if(view.getId() == R.id.tv_saludo){
            tvSaludo.setText("Cambiando texto desde textview");
        }*/
}