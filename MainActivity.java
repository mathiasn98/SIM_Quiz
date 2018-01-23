package com.example.mathias.simquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) { //mengganti activity dan mengirimkan nama yang diinput
        Intent intent = new Intent(this, Halaman1.class);
        EditText teks1 = (EditText) findViewById(R.id.teks1);
        String teks2 = teks1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, teks2);
        startActivity(intent);
    }
}
