package com.iavariav.root.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TiketPesawatActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    private ArrayList<TiketPesawatModel> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiket_pesawat);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(DataTiketPesawat.getTiketPesawat());

        showRecyler();


    }

    private void showRecyler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PesawatTiketAdapter pesawatTiketAdapter = new PesawatTiketAdapter(this);
        pesawatTiketAdapter.setListTiketPesawat(list);
        recyclerView.setAdapter(pesawatTiketAdapter);
    }
}
