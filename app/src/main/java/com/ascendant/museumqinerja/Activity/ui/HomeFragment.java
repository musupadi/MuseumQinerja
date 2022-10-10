package com.ascendant.museumqinerja.Activity.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ascendant.museumqinerja.Activity.ui.Koleksi.KoleksiActivity;
import com.ascendant.museumqinerja.Activity.ui.Master.MasterActivity;
import com.ascendant.museumqinerja.Activity.ui.Mutasi.MutasiActivity;
import com.ascendant.museumqinerja.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HomeFragment extends Fragment {


    LinearLayout Master,Mutasi,Koleksi;
    String User,Person,Id,Level;
    ImageView ivHeader;
    TextView tvHeader;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Master = view.findViewById(R.id.linearMaster);
        Mutasi = view.findViewById(R.id.linearMutasi);
        Koleksi = view.findViewById(R.id.linearDataKoleksi);
        Person = "Admin";
        ivHeader = view.findViewById(R.id.ivHeader);
        tvHeader = view.findViewById(R.id.tvHeader);
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        if (hour > 4 && hour < 11){
            tvHeader.setText("Selamat Pagi, "+Person);
            ivHeader.setImageResource(R.drawable.morning);
        }else if(hour >= 11 && hour <15){
            tvHeader.setText("Selamat Siang, "+Person);
            ivHeader.setImageResource(R.drawable.afternoon);
        }else if(hour >= 15 && hour <18){
            tvHeader.setText("Selamat Sore, "+Person);
            ivHeader.setImageResource(R.drawable.evening);
        }else{
            tvHeader.setText("Selamat Malam, "+Person);
            ivHeader.setImageResource(R.drawable.night);
        }
        Master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MasterActivity.class);
                startActivity(intent);
            }
        });
        Mutasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MutasiActivity.class);
                startActivity(intent);
            }
        });
        Koleksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), KoleksiActivity.class);
                startActivity(intent);
            }
        });
    }
}