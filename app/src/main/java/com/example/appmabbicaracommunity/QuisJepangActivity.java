package com.example.appmabbicaracommunity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuisJepangActivity extends AppCompatActivity {
    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "おはようと言っていた挨拶は... Ohayō to itte ita aisatsu wa ...",
            "“Buku saya” を日本語に変えて... O nihongo ni kaete...",
            "“Tsu ku ru ka “ をひらがな文字に変更すると... O hira gana moji ni henkō suruto...",
            "“Watashi wa indonesia jin desu”.側の文の意味は ... Gawa no bun no imi wa...",
            "かばん　という言葉のインドネシア側は... To iu kotoba no Indoneshia-gawa wa.... "
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "Ohayou gozaimasu", "Konnichiwa", "Sayoonara", "Konbanwa",
            "Watashi wa hon desu", "Watashi no hon desu", "Anata no hon desu", "Hon no Watashi desu",
            "す　る　ぐ　ば", "つ　る　く　か", " つ　く　る　か", "す　く　る　か",
            "Saya bukan orang indonesia", "Saya orang malaysa", "Saya bukan  indonesia", "Saya orang indonesia",
            "Kotak pensil", "Pensil", "Penggaris", "Tas"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "Ohayou gozaimasu",
            "Watashi no hon desu",
            "つ　く　る　か",
            "Saya orang indonesia",
            "Tas"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quisjepang);
        kuis = (TextView) findViewById(R.id.kuis);
        rg = (RadioGroup) findViewById(R.id.pilihan);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        kuis.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                kuis.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);

            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this,"Kamu Jawab Dulu", Toast.LENGTH_LONG).show();
        }
    }
}
