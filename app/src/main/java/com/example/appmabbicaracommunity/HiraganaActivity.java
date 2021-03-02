package com.example.appmabbicaracommunity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HiraganaActivity extends AppCompatActivity implements AdapterRecyclerView.ItemClickListener {


    AdapterRecyclerView adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana);
        // data to populate the RecyclerView with
        String[] data = {"あ A", "い I", "う U", "え E", "お O", "か KA", "き KI", "く KU", "け KE", "こ KO", "さ SA", "し SHI","す SU",
                "せ SE","そ SO","た TA","ち CHI","つ TSU","て TE","と TO","な NA","に NI","ぬ NU","ね NE","の NO","は HA","ひ HI","ふ FU","へ HE",
                "ほ HO","ま MA","み MI","む MU","め ME","も MO","や YA","","ゆ YU","よ YO","ら RA","り RI","る RU","れ RE","ろ RO","わ WA",
                "","を WO","","ん N"};
        // set up the RecyclerView

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNumbers);
        int numberOfColumns = 5;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new AdapterRecyclerView(this, data);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

}