package com.example.appmabbicaracommunity.simulasijepang;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.appmabbicaracommunity.R;
import com.example.appmabbicaracommunity.HiraganaActivity;
import com.example.appmabbicaracommunity.KalimatUmumActivity;
import com.example.appmabbicaracommunity.KatakanaActivity;
import com.example.appmabbicaracommunity.PanduanVideoActivity;
import com.example.appmabbicaracommunity.PenulisanActivity;
import com.example.appmabbicaracommunity.QuisJepangActivity;
import com.example.appmabbicaracommunity.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class SimulasiJepangFragment extends Fragment {

    private Button buttonquis, buttonhiragana, buttonkatakana, buttonpengucapan, buttonpanduanvideo, buttonkalimatumum;
    private SimulasiJepangViewModel simulasiJepangViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        simulasiJepangViewModel =
                ViewModelProviders.of(this).get(SimulasiJepangViewModel.class);
        View root = inflater.inflate(R.layout.fragment_simulasijepang, container, false);
        buttonquis = root.findViewById(R.id.btn_quis);
        buttonhiragana = root.findViewById(R.id.btn_hiragana);
        buttonkatakana = root.findViewById(R.id.btn_katakana);
        buttonpengucapan = root.findViewById(R.id.btn_pengucapan);
        buttonpanduanvideo = root.findViewById(R.id.btn_panduanvideo);
        buttonkalimatumum = root.findViewById(R.id.btn_kalimatumum);



        buttonquis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), QuisJepangActivity.class);
                startActivity(i);

            }
        });
        buttonhiragana.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), HiraganaActivity.class);
                startActivity(i);

            }
        });
        buttonkatakana.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), KatakanaActivity.class);
                startActivity(i);

            }
        });
        buttonpengucapan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PenulisanActivity.class);
                startActivity(i);

            }
        });
        buttonpanduanvideo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PanduanVideoActivity.class);
                startActivity(i);

            }
        });

        buttonkalimatumum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), KalimatUmumActivity.class);
                startActivity(i);

            }
        });

        return root;

    }
}




