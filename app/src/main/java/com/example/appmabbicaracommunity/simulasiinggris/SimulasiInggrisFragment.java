package com.example.appmabbicaracommunity.simulasiinggris;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.appmabbicaracommunity.R;
import com.example.appmabbicaracommunity.HewanInggrisActivity;
import com.example.appmabbicaracommunity.KalimatUmumInggrisActivity;
import com.example.appmabbicaracommunity.NumberInggrisActivity;
import com.example.appmabbicaracommunity.PanduanVideoInggrisActivity;
import com.example.appmabbicaracommunity.QuisInggrisActivity;
import com.example.appmabbicaracommunity.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class SimulasiInggrisFragment extends Fragment {

    private Button buttonquis, buttonangka, buttonkalimatumum, buttonhewan, buttonpanduanvideoinggris;
    private SimulasiInggrisViewModel simulasiInggrisViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        simulasiInggrisViewModel =
                ViewModelProviders.of(this).get(SimulasiInggrisViewModel.class);
        View root = inflater.inflate(R.layout.fragment_simulasiinggris, container, false);
        buttonquis = root.findViewById(R.id.btn_quis);
        buttonangka = root.findViewById(R.id.btn_angka);
        buttonkalimatumum = root.findViewById(R.id.btn_kalimatumum1);
        buttonhewan = root.findViewById(R.id.btn_hewan);
        buttonpanduanvideoinggris = root.findViewById(R.id.btn_panduanvideoinggris);



        buttonquis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), QuisInggrisActivity.class);
                startActivity(i);

            }
        });
        buttonangka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), NumberInggrisActivity.class);
                startActivity(i);

            }
        });
        buttonkalimatumum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), KalimatUmumInggrisActivity.class);
                startActivity(i);

            }
        });
        buttonhewan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), HewanInggrisActivity.class);
                startActivity(i);

            }
        });
        buttonpanduanvideoinggris.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PanduanVideoInggrisActivity.class);
                startActivity(i);

            }
        });

        return root;

    }
}




