package com.example.daftarmahasiswacrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tambah extends AppCompatActivity {

    private DatabaseHandler db;
    private EditText Enama, Enim, Ejurusan;
    private String Snama, Snim, Sjurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        db = new DatabaseHandler(this);

        Enama = (EditText) findViewById(R.id.create_nama) ;
        Enim = (EditText) findViewById(R.id.create_nim) ;
        Ejurusan = (EditText) findViewById(R.id.create_jurusan) ;


        Button btnCreate = (Button) findViewById(R.id.create_btn);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snama = String.valueOf(Enama.getText());
                Snim = String.valueOf(Enim.getText());
                Sjurusan = String.valueOf(Ejurusan.getText());


                if (Snama.equals("")){
                    Enama.requestFocus();
                    Toast.makeText(tambah.this, "Silahkan isi nama", Toast.LENGTH_SHORT).show();
                } else if (Snim.equals("")){
                    Enim.requestFocus();
                    Toast.makeText(tambah.this, "Silahkan isi nim", Toast.LENGTH_SHORT).show();
                } else if (Sjurusan.equals("")){
                    Ejurusan.requestFocus();
                    Toast.makeText(tambah.this, "Silahkan isi jurusan", Toast.LENGTH_SHORT).show();
                }else {
                    Enama.setText("");
                    Enim.setText("");
                    Ejurusan.setText("");
                    Toast.makeText(tambah.this, "Data telah ditambah", Toast.LENGTH_SHORT).show();
                    db.CreateMahasiswa(new modalMahasiswa(null, Snama, Snim, Sjurusan));
                }

            }
        });
    }
}
