package com.example.Pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        Button button4 = (Button) findViewById(R.id.prx_tela4);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Tela3.this, Tela4.class);
                startActivity(it);
            }
        });
        Button button5 = (Button) findViewById(R.id.prx_tela2);

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Tela3.this, Segunda_Teal.class);
                startActivity(it);
            }
        });
    }
}