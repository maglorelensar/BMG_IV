package com.example.c19_e_ticaret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SepetActivity extends AppCompatActivity {
    private Button urnGeriDon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepet);

        urnGeriDon=findViewById(R.id.urnGeriDon);

        urnGeriDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SepetActivity.this,UrunlerActivity.class));
            }
        });
    }
}