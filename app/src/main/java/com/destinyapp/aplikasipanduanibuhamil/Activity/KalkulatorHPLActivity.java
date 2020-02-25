package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DatePickerDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.aplikasipanduanibuhamil.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class KalkulatorHPLActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    EditText tanggal,bulan,tahun;
    Button Hitung;
    TextView tanggalHPHT,tanggalPilihan;
    CardView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_hpl);
//        tanggal= findViewById(R.id.etTanggal);
//        bulan= findViewById(R.id.etBulan);
//        tahun= findViewById(R.id.etTahun);
        MediaPlayer SuaraLagu = MediaPlayer.create(KalkulatorHPLActivity.this,R.raw.kalkulatorhpl);
        SuaraLagu.start();
        Hitung= findViewById(R.id.btnHitung);
        tanggalHPHT = findViewById(R.id.tvTanggalHPL);
        tanggalPilihan = findViewById(R.id.tvTanggalPilihan);
        card = findViewById(R.id.cardView);
        card.setVisibility(View.GONE);
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });

    }

    private void showDatePicker(){
        DatePickerDialog dialog = new DatePickerDialog(this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        dialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        String date = year+"-"+month+"-"+day;
        card.setVisibility(View.VISIBLE);
        tanggalPilihan.setText(date);
        tanggalHPHT.setText(HitungLogic(year,month,day));
    }

    private String HitungLogic(int year,int month,int day){
        if (month >= 1 && month < 3){
            month  = month + 9;
        }else{
            month = month - 3;
            year = year +1;
        }
        String oldDate = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(oldDate));
        }catch (Exception e){
            Toast.makeText(this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
        }
        c.add(Calendar.DAY_OF_MONTH,7);
        String newDate = simpleDateFormat.format(c.getTime());
        return newDate;
    }
}
