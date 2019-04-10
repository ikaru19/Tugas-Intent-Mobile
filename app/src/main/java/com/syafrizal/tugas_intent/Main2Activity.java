package com.syafrizal.tugas_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    private String nama;
    private String alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        nama = intent.getStringExtra("NAMA");
        alamat = intent.getStringExtra("ALAMAT");
        String no = intent.getStringExtra("NO");

        TextView nameTV = findViewById(R.id.tv_nama);
        TextView alamatTV = findViewById(R.id.tv_alamat);
        TextView noTV = findViewById(R.id.tv_noHp);

        nameTV.setText(nameTV.getText().toString() + nama);
        alamatTV.setText(alamatTV.getText().toString() +  alamat);
        noTV.setText(noTV.getText().toString() + no);


    }

    public void ShareClick(View view) {
        String share = "Nama : " + nama + "\n" + "Alamat : " + alamat;
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEX, share);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
