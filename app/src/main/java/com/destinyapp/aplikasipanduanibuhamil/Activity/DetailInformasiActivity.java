package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.destinyapp.aplikasipanduanibuhamil.R;

public class DetailInformasiActivity extends AppCompatActivity {
    TextView title,deskripsi;
    ImageView gamhar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_informasi);


        gamhar = findViewById(R.id.ivIcon);
        title = findViewById(R.id.tvTittle);
        deskripsi = findViewById(R.id.tvDeskripsi);
        Intent data = getIntent();
        String GAMBAR = data.getStringExtra("GAMBAR");
        String TITTLE = data.getStringExtra("TITTLE");
        String DESKRIPSI = data.getStringExtra("DESKRIPSI");
        String SUARA = data.getStringExtra("SUARA");
        MediaPlayer SuaraLagu = MediaPlayer.create(DetailInformasiActivity.this,Integer.parseInt(SUARA));
        SuaraLagu.start();
        gamhar.setImageResource(Integer.parseInt(GAMBAR));
        title.setText(TITTLE);
        deskripsi.setText(DESKRIPSI);
    }
}
