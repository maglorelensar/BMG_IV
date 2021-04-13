package com.example.c19_e_ticaret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private TextView txtEposta;
     private TextView txtSifre;
     private Button btnGiris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGiris=findViewById(R.id.btnGiris);
        txtEposta=findViewById(R.id.txtEposta);
        txtSifre=findViewById(R.id.txtSifre);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,UrunlerActivity.class));
            }
        });


}
}