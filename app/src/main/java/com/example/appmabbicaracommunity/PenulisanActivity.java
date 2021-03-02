package com.example.appmabbicaracommunity;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PenulisanActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PenulisanAdapter adapter;
    private ArrayList<Penulisan> penulisanArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penulisan);
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_penulisan);

        adapter = new PenulisanAdapter(penulisanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PenulisanActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        penulisanArrayList = new ArrayList<>();
        penulisanArrayList.add(new Penulisan("Subjek-wa-predikat", "わたしわおよぎます", "watashi wa oyogimasu","Saya berenang"));
        penulisanArrayList.add(new Penulisan("Keterangan waktu-Subjek-wa-Objek-o-Predikat", "今日私はテレビを見ています", "Kyō watashi wa terebi o mite imasu","Hari ini saya menonton TV"));
        penulisanArrayList.add(new Penulisan("Subjek-ga-keterangan waktu-wa-predikat", "日本が今は秋です", "Nihon ga ima wa akidesu","di Jepang sekarang sedang musim gugur"));
        penulisanArrayList.add(new Penulisan("Subjek-wa-keterangan-no-objek-o-predikat", "私は日本の辞書を読んでいます", "Watashi wa Nihon no jisho o yonde imasu","Saya sedang membaca kamus bahasa Jepang"));
        penulisanArrayList.add(new Penulisan("Kalimat positif = Subjek-wa-Subjek-desu", "あゆみは歌手です", "Ayumi san wa kashu desu","Ayumi adalah seorang penyanyi"));
        penulisanArrayList.add(new Penulisan("Kalimat negatif = Subjek-wa-subjek-dewa nai", "あゆみは歌手ではない", "Ayumi wa kashu dewa nai","Ayumi bukan seorang penyanyi"));
        penulisanArrayList.add(new Penulisan("Subjek-wa-Subjek/kata benda-desu ka/masu ka", "あなたは先生ですか", "Anata wa sensei desuka?","Apakah anda seorang guru?"));
        penulisanArrayList.add(new Penulisan("Kalimat jawab positif = Hai-Subjek/kata benda-wa-Subjek/kata benda-desu/masu", "はい、私は先生です", "Hai, watashi wa sensei desu","Ya, saya seorang guru"));
        penulisanArrayList.add(new Penulisan("Kalimat jawab negatif = Iie-Subjek/kata benda wa-Subjek/kata benda-janai/dewa arimasen/masen", "いいえ、私は先生じゃない", "Īe, watashi wa sensei janai","bukan, saya bukan seorang guru"));
        penulisanArrayList.add(new Penulisan("Subjek-wa-keterangan-no-objek-o-predikat", "私は日本の辞書を読んでいます", "Watashi wa Nihon no jisho o yonde imasu","Saya sedang membaca kamus bahasa Jepang"));

    }

}