package com.example.appmabbicaracommunity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class KatakanaActivity extends AppCompatActivity implements AdapterRecyclerView.ItemClickListener {
    AdapterRecyclerView adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katakana);
        // data to populate the RecyclerView with
        String[] data = {"ア A", "イ I", "ウ U", "エ E", "オ O", "カ KA", "キ KI", "ク KU", "ケ KE", "コ KO", "サ SA", "シ SHI","ス SU",
                "セ SE","ソ SO","タ TA","チ CHI","ツ TSU","テ TE","ト TO","ナ NA","ニ NI","ヌ NU","ネ NE","ノ NO","ハ HA","ヒ HI","フ FU","ヘ HE",
                "ホ HO","マ MA","ミ MI","ム MU","メ ME","モ MO","ヤ YA","","ユ YU","ヨ YO","ラ RA","リ RI","ル RU","レ RE","ロ RO","ワ WA",
                "","ヲ WO","","ン N"};
        // set up the RecyclerView

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNumbers);
        int numberOfColumns = 5;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new AdapterRecyclerView(this, data);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

}