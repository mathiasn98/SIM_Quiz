package com.example.mathias.simquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

import org.w3c.dom.Text;

import static android.R.attr.data;
import static android.R.attr.editTextColor;
import static com.example.mathias.simquiz.MainActivity.EXTRA_MESSAGE;

public class Halaman1 extends AppCompatActivity{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        // Get the Intent that started this activity and extract the string


        // Capture the layout's TextView and set the string as its text

    }

    public void hitungBenar(View view){
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        int skor = 0;
        //deklarasi berbagai variabel yang dibutuhkan
        TextView skorHasil = (TextView) findViewById(R.id.skorFinal);
        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        int checkedRadioButtonId1 = radioGroup1.getCheckedRadioButtonId();
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        int checkedRadioButtonId2 = radioGroup2.getCheckedRadioButtonId();
        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radioGroup3);
        int checkedRadioButtonId3 = radioGroup3.getCheckedRadioButtonId();
        CheckBox cBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox cBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox cBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox cBox4 = (CheckBox) findViewById(R.id.checkBox4);
        TextView radioText11 = (TextView) findViewById(R.id.teks11);
        TextView radioText22 = (TextView) findViewById(R.id.teks22);
        TextView radioText32 = (TextView) findViewById(R.id.teks32);
        EditText answer4 = (EditText) findViewById(R.id.jawab4);
        String jawaban4 = answer4.getText().toString();
            if (checkedRadioButtonId1 == R.id.radioButton11) { //pertanyaan1
                skor++;
                radioText11.setTextColor(Color.parseColor("#64DD17"));
            }
            if (checkedRadioButtonId2 == R.id.radioButton22) { //pertanyaan2
                skor++;
                radioText22.setTextColor(Color.parseColor("#64DD17"));
            }
            if (checkedRadioButtonId3 == R.id.radioButton32) { //pertanyaan3
                skor++;
                radioText32.setTextColor(Color.parseColor("#64DD17"));
            }
            if(jawaban4.toLowerCase().equals("surat izin mengemudi")){ //pertanyaan4, EditText
                skor++;
                answer4.setTextColor(Color.parseColor("#64DD17"));
            }
            if(cBox1.isChecked() && cBox2.isChecked() && cBox4.isChecked()){
                skor++;
                cBox1.setTextColor(Color.parseColor("#64DD17"));
                cBox2.setTextColor(Color.parseColor("#64DD17"));
                cBox4.setTextColor(Color.parseColor("#64DD17"));
            }
        skor=skor*100;
        skorHasil.setText("Total skor : "+skor);

        TextView text1 = (TextView) findViewById(R.id.namaUser);
        text1.setText("Pemain : "+ message);
        Toast.makeText(Halaman1.this, "Skor Anda "+skor, Toast.LENGTH_LONG).show();
    }
}// onCreate()

