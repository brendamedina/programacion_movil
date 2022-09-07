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
    private Button btnRecyclerCampus;
    private Button btnListCampus;
    private Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginFacebook = findViewById(R.id.btn_login_facebook);
        btnRecyclerCampus = findViewById(R.id.btn_recycler_view);
        btnListCampus = findViewById(R.id.btn_recycler_campus);
        btnAlert = findViewById(R.id.btn_alerta);


        btnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnRecyclerCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });

        btnListCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ListCampusActivity.class);
                startActivity(intent);
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AlertActivity.class);
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