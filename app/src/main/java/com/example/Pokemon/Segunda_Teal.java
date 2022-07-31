 package com.example.Pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class Segunda_Teal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_teal);

        Button button2 = (Button) findViewById(R.id.prx_tela3);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Segunda_Teal.this, Tela3.class);
                startActivity(it);
            }
        });
        Button button3 = (Button) findViewById(R.id.prx_telaInicio);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Segunda_Teal.this,MainActivity .class);
                startActivity(it);
            }
        });
    }
}