package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.destinyapp.aplikasipanduanibuhamil.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout Informasi,Mitos,Kalkulator,Tentang;
    ImageView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Informasi = findViewById(R.id.linearInformasiKehamilan);
        Mitos = findViewById(R.id.linearMitosKehamilan);
        Kalkulator = findViewById(R.id.linearKalkulatorHPL);
        Tentang = findViewById(R.id.linearTentang);
        exit=(ImageView)findViewById(R.id.ivExit);

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
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer SuaraLagu = MediaPlayer.create(MainActivity.this,R.raw.exit);
                SuaraLagu.start();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Anda Yakin ingin Keluar Aplikasi ?")
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.super.onBackPressed();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();

                            }
                        })
                        //Set your icon here
                        .setTitle("Perhatian !!!")
                        .setIcon(R.drawable.ic_exit_to_app_black_24dp);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
