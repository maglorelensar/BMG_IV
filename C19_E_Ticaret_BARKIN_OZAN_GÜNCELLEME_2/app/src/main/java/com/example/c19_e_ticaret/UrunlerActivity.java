package com.example.c19_e_ticaret;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import org.w3c.dom.Text;

public class UrunlerActivity extends AppCompatActivity {
    private Button spt1,spt2,spt3,spt4;
    private ImageButton sptReal;
    private Text txt1,txt2,txt3,txt4;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urunler);

        spt1=findViewById(R.id.spt1);
        spt2=findViewById(R.id.spt2);
        spt3=findViewById(R.id.spt3);
        spt4=findViewById(R.id.spt4);
        sptReal=findViewById(R.id.sptReal);

        sptReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UrunlerActivity.this,SepetActivity.class));
            }
        });

    }
}