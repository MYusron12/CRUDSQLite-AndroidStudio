package com.example.daftarmahasiswacrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button buttontambahdata;
    Button buttonlihatdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttontambahdata = findViewById(R.id.buttontambahdata);
        buttontambahdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menujutambahdata = new Intent(home.this, tambah.class);
                startActivity(menujutambahdata);
            }
        });

        buttonlihatdata = findViewById(R.id.buttonlihatdata);
        buttonlihatdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatdata = new Intent(home.this, listProfile.class);
                startActivity(lihatdata);
            }
        });
    }
}
