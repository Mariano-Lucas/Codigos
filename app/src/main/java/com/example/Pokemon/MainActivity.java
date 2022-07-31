package com.example.Pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.bt_Segunda_Tela);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Segunda_Teal.class);
                startActivity(it);
            }
        });

        Button button10 = (Button) findViewById(R.id.ir_Tela3);

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela3.class);
                startActivity(it);
            }
        });

        Button button11 = (Button) findViewById(R.id.ir_Tela4);

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela4.class);
                startActivity(it);
            }
        });
    }
}