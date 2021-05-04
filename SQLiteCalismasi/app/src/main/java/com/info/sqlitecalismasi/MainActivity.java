package com.info.sqlitecalismasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private VeritabaniYardimcisi vt = new VeritabaniYardimcisi(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Kisilerdao().kisiEkle(vt,"Mehmet ARDIÇ","05674321245",18,1.69);

    }
}
