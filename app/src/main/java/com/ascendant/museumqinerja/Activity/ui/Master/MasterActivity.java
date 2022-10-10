package com.ascendant.museumqinerja.Activity.ui.Master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ascendant.museumqinerja.R;

public class MasterActivity extends AppCompatActivity {
    LinearLayout Back;
    LinearLayout Jabatan,Negara,MataUang,JenisPerolehan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        Declaration();
        OnClick();
    }
    private void Declaration(){
        Back = findViewById(R.id.linearBack);
        Jabatan = findViewById(R.id.linearJabatan);
        Negara = findViewById(R.id.linearNegara);
        MataUang = findViewById(R.id.linearMataUang);
        JenisPerolehan = findViewById(R.id.linearJenisPerolehan);
    }
    private void OnClick(){
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Jabatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Negara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        MataUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        JenisPerolehan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}