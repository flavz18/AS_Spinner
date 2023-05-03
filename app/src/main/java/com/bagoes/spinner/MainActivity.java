package com.bagoes.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, _spinner4, _spinner5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinner1 = findViewById(R.id.spinner1);
        _spinner2 = findViewById(R.id.spinner2);
        _spinner3 = findViewById(R.id.spinner3);
        _spinner4 = findViewById(R.id.spinner4);
//        _spinner5 = findViewById(R.id.spinner5);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
//        initSpinner5();
    }
    private void initSpinner1() {
        List<String> buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,buahList);
        _spinner1.setAdapter(arrayAdapter);
    }
    private void initSpinner2() {
        List<String> mahasiswaList = new ArrayList<>();

        for(int i = 1; i <= 1000; i++) {
            mahasiswaList.add("Mahasiswa ke-" + i);
        }

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spinner2.setAdapter(arrayAdapter2);
    }
    private void initSpinner3() {
        List<String> ganjilList = new ArrayList<>();

        for (int i = 1; i <= 999; i+=2) {
            ganjilList.add("Bilangan ke-" + i);
        }

        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        _spinner3.setAdapter(arrayAdapter3);
    }

    private void initSpinner4() {
        List<String> genapList = new ArrayList<>();

        for (int i = 2; i <= 999; i+=2) {
            genapList.add("Bilangan ke-" + i);
        }

        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genapList);
        _spinner4.setAdapter(arrayAdapter4);
    }
//    private void initSpinner5() {
//        List<String> primaList = new ArrayList<>();
//        int awal = 1;
//        int akhir = 100;
//        for (int i = awal; i <= akhir; i++) {
//            int bil = 0;
//            for (int j=i; j<i; j++)
//                if (i%j==0){
//                    bil=bil+1;
//            }
//            if (bil==2){
//                primaList.add("Bilangan ke-" + bil);
//            }
//
//        }
//
//        ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, primaList);
//        _spinner5.setAdapter(arrayAdapter5);
//    }
}