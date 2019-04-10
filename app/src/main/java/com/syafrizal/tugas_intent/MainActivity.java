package com.syafrizal.tugas_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText namaTextView;
    private EditText alamatTextView;
    private EditText noTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namaTextView = findViewById(R.id.et_nama);
        alamatTextView = findViewById(R.id.et_alamat);
        noTextView = findViewById(R.id.et_nomor);
    }

    public void register(View view) {
        String nama = namaTextView.getText().toString();
        String alamat = alamatTextView.getText().toString();
        String no = noTextView.getText().toString();

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("NAMA",nama);
        intent.putExtra("ALAMAT",alamat);
        intent.putExtra("NO",no);
        startActivity(intent);
    }
}
