package com.unam.fesar.login;

import android.content.Intent;
import android.media.session.MediaController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usuario, password;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Activity", "Formulario");

        usuario = (EditText)findViewById(R.id.txtNombre);
        password = (EditText)findViewById(R.id.password);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((usuario.getText() != null || password.getText() != null) &&
                        (usuario.getText().toString().equals("Marco2410") && password.getText().toString().equals("12345"))){
                    Intent i = new Intent(getBaseContext(), acceso.class);
                    i.putExtra("nombre", "Marco Nava");
                    startActivity(i);
                    // finish();
                }
                else {
                    Intent i = new Intent(getBaseContext(), Error.class);
                    startActivity(i);
                }
            }
        });


    }
}
