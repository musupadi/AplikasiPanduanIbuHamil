package com.destinyapp.aplikasipanduanibuhamil.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.destinyapp.aplikasipanduanibuhamil.Adapter.AdapterInformasiKehamilan;
import com.destinyapp.aplikasipanduanibuhamil.Model.DataModel;
import com.destinyapp.aplikasipanduanibuhamil.Model.InformasiData;
import com.destinyapp.aplikasipanduanibuhamil.R;

import java.util.ArrayList;

public class InformasiKehamilanActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<DataModel> pList = new ArrayList<>();
    private RecyclerView.LayoutManager mManager;
    AdapterInformasiKehamilan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_kehamilan);

        MediaPlayer SuaraLagu = MediaPlayer.create(InformasiKehamilanActivity.this,R.raw.informasikehamilan);
        SuaraLagu.start();
        recyclerView = findViewById(R.id.recycler);
        pList.addAll(InformasiData.getListData());
        mManager = new LinearLayoutManager(InformasiKehamilanActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(mManager);
        adapter = new AdapterInformasiKehamilan(InformasiKehamilanActivity.this,pList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
