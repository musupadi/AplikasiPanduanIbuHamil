package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.aplikasipanduanibuhamil.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout Informasi,Mitos,Kalkulator,Tentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Informasi = findViewById(R.id.linearInformasiKehamilan);
        Mitos = findViewById(R.id.linearMitosKehamilan);
        Kalkulator = findViewById(R.id.linearKalkulatorHPL);
        Tentang = findViewById(R.id.linearTentang);

        Informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InformasiKehamilanActivity.class);
                startActivity(intent);
            }
        });
        Mitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MitosActivity.class);
                startActivity(intent);
            }
        });
        Kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KalkulatorHPLActivity.class);
                startActivity(intent);
            }
        });
        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
    }
}
