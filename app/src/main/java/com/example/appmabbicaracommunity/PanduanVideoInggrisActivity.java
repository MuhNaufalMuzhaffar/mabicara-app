package com.example.appmabbicaracommunity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PanduanVideoInggrisActivity extends AppCompatActivity {

    MediaController media_Controller;
    DisplayMetrics dm;
    VideoView videoViewSaya;
    TextView txtJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_video_inggris);


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
        muatVideo("Kata Sifat dalam Bahasa Inggris yang Sering digunakan dalam Kehidupan sehari hari", "video001");
    }

    public void video2(View view) {
        muatVideo("Kosa Kata Bahasa Inggris yang ada disekeliling Kita", "video002");
    }

    public void video3(View view) {
        muatVideo("Kosa Kata Bahasa Inggris tentang KAMAR MANDI", "video003");
    }
}
