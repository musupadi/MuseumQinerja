package com.ascendant.museumqinerja.Activity.ui.Mutasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ascendant.museumqinerja.R;

public class MutasiActivity extends AppCompatActivity {
    LinearLayout Back;
    LinearLayout MutasiBenda,JenisMutasi,ManagementPersetujuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutasi);
        Declaration();
        OnClick();


    }

    private void Declaration(){
        Back = findViewById(R.id.linearBack);
        MutasiBenda = findViewById(R.id.linearMutasiBenda);
        JenisMutasi = findViewById(R.id.linearJenisMutasi);
        ManagementPersetujuan = findViewById(R.id.linearManagementPersetujuan);
    }
    private void OnClick(){
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        MutasiBenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        JenisMutasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ManagementPersetujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}