package com.unam.fesar.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class acceso extends AppCompatActivity {

    TextView nombre;
    Button btnsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        nombre = (TextView)findViewById(R.id.txtUsuario);
        btnsalir = (Button)findViewById(R.id.btnSalir);
        Bundle costal = getIntent().getExtras();

        nombre.setText(costal.getString("nombre"));

        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
