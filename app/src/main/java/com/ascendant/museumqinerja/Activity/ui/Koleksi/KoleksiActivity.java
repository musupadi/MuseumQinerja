package com.ascendant.museumqinerja.Activity.ui.Koleksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ascendant.museumqinerja.R;

public class KoleksiActivity extends AppCompatActivity {
    LinearLayout Back;
    LinearLayout Benda,Cerita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koleksi);
        Declaration();
        OnClick();
    }
    private void Declaration(){
        Back = findViewById(R.id.linearBack);
        Benda = findViewById(R.id.linearBenda);
        Cerita = findViewById(R.id.linearCerita);
    }
    private void OnClick() {
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Benda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Cerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}