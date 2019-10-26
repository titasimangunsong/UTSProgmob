package com.example.utsprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.utsprogmob.Adapter.KelasAdapter;
import com.example.utsprogmob.Model.Kelas;
import com.example.utsprogmob.R;

import java.util.ArrayList;

public class RecyclerViewKelas extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KelasAdapter kelasAdapter;
    private ArrayList<Kelas> kelasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_kelas);

        this.setTitle("SI KRS - Hai Mahasiswa");

        tambahData();

        recyclerView = findViewById(R.id.rvKelas);
        kelasAdapter = new KelasAdapter(kelasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKelas.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kelasAdapter);
    }

    public void tambahData() {
        kelasList = new ArrayList<>();
        kelasList.add(new Kelas("001", "Chara 3-1", "3", "Jumat", "Umi Proboyekti", "60"));
        kelasList.add(new Kelas("002", "Didaktos 3-1", "3", "Senin", "Yetli Oslan", "60"));
        kelasList.add(new Kelas("003", "Biblos 3-1", "3", "Selasa", "Lussy Ernawati", "60"));
    }
}
