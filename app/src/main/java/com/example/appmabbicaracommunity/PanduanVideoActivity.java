package com.example.appmabbicaracommunity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class PanduanVideoActivity extends AppCompatActivity {
    MediaController media_Controller;
    DisplayMetrics dm;
    VideoView videoViewSaya;
    TextView txtJudul;


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_video);

        // view
        videoViewSaya = (VideoView) findViewById(R.id.videoViewUtama);
        txtJudul = (TextView) findViewById(R.id.txtJudul);

        // inisialisasi
        media_Controller = new MediaController(this);
        dm = new DisplayMetrics();

        // ambil ukuran layar
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;

        // lebar dan tinggi video view diberi nilai agar menyesuaikan ukuran layout
        videoViewSaya.setMinimumWidth(width);
        videoViewSaya.setMinimumHeight(height);

        // kontroler video
        videoViewSaya.setMediaController(media_Controller);
    }

    private void muatVideo(String judul, String nama_file) {
        // kasih judul
        txtJudul.setText(judul);

        // ambil video
        videoViewSaya.setVideoPath("android.resource://" + getPackageName() + "/raw/" + nama_file);

        // mulai
        videoViewSaya.start();
    }

    public void video1(View view) {
        muatVideo("Pelajaran Bahasa Jepang 'Hiragana'", "video01");
    }

    public void video2(View view) {
        muatVideo("Pelajaran bahasa Jepang Lafal ZaZuZeZo", "video02");
    }

    public void video3(View view) {
        muatVideo("Pelajaran bahasa Jepang Pengucapan Angka", "video03");
    }
    public void video4(View view) {
        muatVideo("Pelajaran Bahasa Jepang 'Katakana'", "video04");
    }


}
