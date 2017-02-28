package com.example.ssh.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double angkaA, angkaB;
    EditText angkaAtas, angkaBawah;
    RadioButton tambah, kurang, kali, bagi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaAtas = (EditText)findViewById(R.id.angkaAtas);
        angkaBawah = (EditText)findViewById(R.id.angkaBawah);

        tambah = (RadioButton) findViewById(R.id.tambah);
        kurang = (RadioButton) findViewById(R.id.kurang);
        kali = (RadioButton) findViewById(R.id.kali);
        bagi = (RadioButton) findViewById(R.id.bagi);

        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
    }
    public void hitung(View v){
        angkaA = Double.parseDouble(angkaAtas.getText().toString());
        angkaB = Double.parseDouble(angkaBawah.getText().toString());

        if(tambah.isChecked()) {
            hasil.setText("Hasil : " + tambah());
        }else if (kurang.isChecked()){
            hasil.setText("Hasil : " + kurang());
        }else if (kali.isChecked()){
            hasil.setText("Hasil : " + kali());
        }else if (bagi.isChecked()){
            hasil.setText("Hasil : " + bagi());
        }
    }
    public Double tambah(){
        return angkaA + angkaB;
    }
    public Double kurang(){
        return angkaA - angkaB;
    }
    public Double kali(){
        return angkaA * angkaB;
    }
    public Double bagi(){
        return angkaA / angkaB;
    }
}