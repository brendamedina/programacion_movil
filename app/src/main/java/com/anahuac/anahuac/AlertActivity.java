package com.anahuac.anahuac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    private Button btnAlert;
    private Button btnAlertWithButtons;
    private Button btnAlertWithOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnAlert = findViewById(R.id.btn_alerta);
        btnAlertWithButtons = findViewById(R.id.btn_alert_with_button);
        btnAlertWithOptions = findViewById(R.id.btn_alert_with_options);

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Mi primera alerta");
                builder.setMessage("Este es mi mensaje");
                builder.create().show();
            }
        });

        btnAlertWithButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Mi primera alerta");
                builder.setMessage("Este es mi mensaje");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Positivo", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Negativo", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("Ayuda", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Neutral", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create().show();
            }
        });

        btnAlertWithOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Selecciona un color");
                String[] array = new String[3];
                array[0] = "Verde";
                array[1] = "Blanco";
                array[2] = "Rojo";
                builder.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, array[i], Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create().show();
            }
        });
    }
}