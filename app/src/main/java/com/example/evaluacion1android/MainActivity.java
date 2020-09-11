package com.example.evaluacion1android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int alto,bajo,total,promedio,primer,ultimo; //recuerda agregar los montos del folio mas alto y mas bajo
    int falto,fbajo,ftotal,fpromedio,fprimer,fultimo;
    int folio =0;
    int monto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monto = (TextView) findViewById(R.id.fMonto);
        folimontoalto = (TextView) findViewById(R.id.fmalto);
    }
    public void ingreso(View v){
        folio=folio+1;
        int num;
        num = Integer.parseInt(monto.getText().toString());
        if (num > alto){
            alto=num;
            falto=folio;
            foliomonto.setText();
        }
        if (num < bajo){
            fbajo=folio;
            bajo=num;
        }
        if (folio ==1){
            fprimer=folio;
            primer=num;
        }
        if (folio > 1){
            fultimo=folio;
            ultimo=num;
        }



    }
}