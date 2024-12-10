package com.example.pkpp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkG01, checkG02,
            checkG03, checkG04,
            checkG05, checkG06,
            checkG07, checkG08, checkG09,
            checkG10, checkG11,
            checkG12, checkG13,
            checkG14, checkG15,
            checkG16, checkG17;

    Button btnDiagnosa;
    TextView tvResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkG01 = findViewById(R.id.cx_G01);
        checkG02 = findViewById(R.id.cx_G02);
        checkG03 = findViewById(R.id.cx_G03);
        checkG04 = findViewById(R.id.cx_G04);
        checkG05 = findViewById(R.id.cx_G05);
        checkG06 = findViewById(R.id.cx_G06);
        checkG07 = findViewById(R.id.cx_G07);
        checkG08 = findViewById(R.id.cx_G08);
        checkG09 = findViewById(R.id.cx_G09);
        checkG10 = findViewById(R.id.cx_G10);
        checkG11 = findViewById(R.id.cx_G11);
        checkG12 = findViewById(R.id.cx_G12);
        checkG13 = findViewById(R.id.cx_G13);
        checkG14 = findViewById(R.id.cx_G14);
        checkG15 = findViewById(R.id.cx_G15);
        checkG16 = findViewById(R.id.cx_G16);
        checkG17 = findViewById(R.id.cx_G17);

        btnDiagnosa = findViewById(R.id.btn_diagnosa);
        tvResult = findViewById(R.id.tv_result);

        tvResult.setText(""); // Kosongkan TextView saat pertama kali aplikasi dijalankan

        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "Anda Menderita Penyakit\n";

                // Untuk Penyakit Gastritis
                if (checkG01.isChecked() && checkG10.isChecked()
                        && checkG11.isChecked() && checkG16.isChecked()) {
                    NamaPenyakit += "Gonorea";
                }
                if (checkG01.isChecked() && checkG02.isChecked()
                        && checkG07.isChecked() && checkG09.isChecked() &&
                        checkG12.isChecked()) {
                    NamaPenyakit += "Herpes";
                }
                if (checkG01.isChecked() && checkG03.isChecked()
                        && checkG08.isChecked() && checkG11.isChecked() &&
                        checkG13.isChecked()) {
                    NamaPenyakit += "Infeksi Jamur";
                }
                if (checkG01.isChecked() && checkG04.isChecked()
                        && checkG07.isChecked() && checkG14.isChecked()) {
                    NamaPenyakit += "Sifilis";
                }
                if (checkG05.isChecked() && checkG06.isChecked()
                        && checkG07.isChecked() && checkG15.isChecked() &&
                        checkG17.isChecked()) {
                    NamaPenyakit += "HIV / AIDS";
                }


                // tampilkan penyakit
                tvResult.setText("" +NamaPenyakit);
            }
        });
    }

    public void onClickChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.cx_G01:
                str = checked ? "Rasa sakit saat ketika buang air kecil Diseleksi" :
                        "Rasa sakit saat ketika buang air kecil Tidak Diseleksi";
                break;
            case R.id.cx_G02:
                str = checked ? "Kesemutan dan gatal-gatal di daerah alat kelamin Diseleksi" :
                        "Kesemutan dan gatal-gatal di daerah alat kelamin Tidak Diseleksi";
                break;
            case R.id.cx_G03:
                str = checked ? "Ruam berwarna kemerah-merahan pada penis Diseleksi" :
                        "Ruam berwarna kemerah-merahan pada penis Tidak Diseleksi";
                break;
            case R.id.cx_G04:
                str = checked ? "Timbul benjolan disekitar alat kelamin Diseleksi" :
                        "Timbul benjolan disekitar alat kelamin Tidak Diseleksi";
                break;
            case R.id.cx_G05:
                str = checked ? "Mengalami Diare atau mual yang berlebihan Diseleksi" :
                        "Mengalami Diare atau mual yang berlebihan Tidak Diseleksi";
                break;
            case R.id.cx_G06:
                str = checked ? "Sering Merasa Kelelahan Diseleksi" :
                        "Sering Merasa Kelelahan Tidak Diseleksi";
                break;
            case R.id.cx_G07:
                str = checked ? "Gejala mirip penyakit flu, seperti demam, kelelahan, pusing kepala, dan anggota badan terasa sakit dan linu Diseleksi" :
                        "Gejala mirip penyakit flu, seperti demam, kelelahan, pusing kepala, dan anggota badan terasa sakit dan linu Tidak Diseleksi";
                break;
            case R.id.cx_G08:
                str = checked ? "Rasa gatal atau terbakar pada ujung penis Diseleksi" :
                        "Rasa gatal atau terbakar pada ujung penis Tidak Diseleksi";
                break;
            case R.id.cx_G09:
                str = checked ? "Timbulnya benjolan berisi cairan pada penis atau daerah genital Diseleksi" :
                        "Timbulnya benjolan berisi cairan pada penis atau daerah genital Tidak Diseleksi";
                break;
            case R.id.cx_G10:
                str = checked ? "Keluarnya cairan nanah kental berwarna kuning kehijauan dari penis Diseleksi" :
                        "Keluarnya cairan nanah kental berwarna kuning kehijauan dari penis Tidak Diseleksi";
                break;
            case R.id.cx_G11:
                str = checked ? "Ujung penis menjadi kemerahan dan membengkak Diseleksi" :
                        "Ujung penis menjadi kemerahan dan membengkak Tidak Diseleksi";
                break;
            case R.id.cx_G12:
                str = checked ? "Pembengkakan kelenjar getah bening yang berada di selangkangan Diseleksi" :
                        "Pembengkakan kelenjar getah bening yang berada di selangkangan Tidak Diseleksi";
                break;
            case R.id.cx_G13:
                str = checked ? "Bercak putih di ujung penis Diseleksi" :
                        "Bercak putih di ujung penis Tidak Diseleksi";
                break;
            case R.id.cx_G14:
                str = checked ? "Ada bercak kemerahan pada tubuh Diseleksi" :
                        "Ada bercak kemerahan pada tubuh Tidak Diseleksi";
                break;
            case R.id.cx_G15:
                str = checked ? "Bintik-bintik putih di lidah atau didalam mulut Diseleksi" :
                        "Bintik-bintik putih di lidah atau didalam mulut Tidak Diseleksi";
                break;
            case R.id.cx_G16:
                str = checked ? "Terjadi peradangan testis dan kelenjar prostat Diseleksi" :
                        "Terjadi peradangan testis dan kelenjar prostat Tidak Diseleksi";
                break;
            case R.id.cx_G17:
                str = checked ? "Terjadi penurunan berat badan yang sangat drastis Diseleksi" :
                        "Terjadi penurunan berat badan yang sangat drastis Tidak Diseleksi";
                break;


        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

}