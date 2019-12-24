package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.aplikasipanduanibuhamil.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class KalkulatorHPLActivity extends AppCompatActivity {
    EditText tanggal,bulan,tahun;
    Button Hitung;
    TextView tanggalHPHT;
    CardView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_hpl);
        tanggal= findViewById(R.id.etTanggal);
        bulan= findViewById(R.id.etBulan);
        tahun= findViewById(R.id.etTahun);
        Hitung= findViewById(R.id.btnHitung);
        tanggalHPHT = findViewById(R.id.tvTanggalHPL);
        card = findViewById(R.id.cardView);
        card.setVisibility(View.GONE);
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card.setVisibility(View.VISIBLE);
                tanggalHPHT.setText(HitungLogic());
            }
        });

    }
    private String HitungLogic(){
        String HPL="";
        Integer Bulan;
        Integer Tahun;
        if (Integer.parseInt(bulan.getText().toString()) >= 1 && Integer.parseInt(bulan.getText().toString()) < 3){
            Bulan  = Integer.parseInt(bulan.getText().toString()) + 9;
            Tahun = Integer.parseInt(tahun.getText().toString());
        }else{
            Bulan = Integer.parseInt(bulan.getText().toString()) - 3;
            Tahun = Integer.parseInt(tahun.getText().toString()) +1;
        }
        String totalHPL = String.valueOf(Tahun)+"-"+String.valueOf(Bulan)+"-"+tanggal.getText().toString();
        String oldDate = totalHPL;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(oldDate));
        }catch (Exception e){
            HPL = "Gagal";
        }
        c.add(Calendar.DAY_OF_MONTH,7);
        String newDate = simpleDateFormat.format(c.getTime());
        return newDate;
    }
}
