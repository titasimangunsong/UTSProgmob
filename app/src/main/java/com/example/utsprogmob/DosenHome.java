package com.example.utsprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.utsprogmob.Model.Dosen;
import com.example.utsprogmob.RecyclerViewKrs;
import com.example.utsprogmob.R;

public class DosenHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen_home);
        this.setTitle("SI KRS - Hai Dosen");

        ImageButton btnDataDiriDsn = (ImageButton)findViewById(R.id.btnDataDiriDosen);
        btnDataDiriDsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosenHome.this, DataDiriDosen.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKelas = (ImageButton)findViewById(R.id.btnLihatKelas);
        btnDaftarKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosenHome.this, RecyclerViewKelas.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKrs = (ImageButton)findViewById(R.id.btnDaftarKrs);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosenHome.this, RecyclerViewKrs.class);
                startActivity(intent);
            }
        });
    }
}