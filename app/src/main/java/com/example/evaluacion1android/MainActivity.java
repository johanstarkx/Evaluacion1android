package com.example.evaluacion1android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int alto=0,bajo=0,total=0,promedio=0,primer,ultimo; //recuerda agregar los montos del folio mas alto y mas bajo
    int falto=0,fbajo,fprimer,fultimo;
    int folio =0;
    TextView monto;
    TextView fma,fmb,fmpri,fmult,t,p,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monto = (TextView) findViewById(R.id.fMonto);
        fma = (TextView) findViewById(R.id.fa);
        fmb = (TextView) findViewById(R.id.fb);
        t = (TextView) findViewById(R.id.ftotal);
        p = (TextView) findViewById(R.id.fpromedio);
        fmpri = (TextView) findViewById(R.id.fprimero);
        fmult = (TextView) findViewById(R.id.fultimo);
        r = (TextView) findViewById(R.id.Confirm);
    }
    public void ingreso(View v){
        int num;
        folio=folio+1;
        num = Integer.parseInt(monto.getText().toString());
        fultimo=folio;
        ultimo=num;
        fmult.setText("F"+fultimo+"$"+ultimo);
        if (bajo==0){
            fbajo=folio;
            bajo=num;
            fmb.setText("BOLETA MONTO BAJO :   "+"F"+fbajo+"$"+bajo);
            fprimer=folio;
            primer=num;
            fmpri.setText("BOLETA MONTO BAJO :   "+"F"+fprimer+"$"+primer);
        }
        if (num > alto){
            falto=folio;
            alto=num;
            fma.setText("BOLETA MONTO ALTO :   "+"F"+falto+"$"+alto);
        }
        else if (num < bajo){
            fbajo=folio;
            bajo=num;
            fmb.setText("BOLETA MONTO BAJO :   "+"F"+fbajo+"$"+bajo);
        }
        total=total+num;
        promedio=total*fultimo/100;
        t.setText("MONTO TOTAL :   "+"$"+total+"");
        p.setText("PROMEDIO VENTAS :   "+"$"+promedio+"");
        r.setText("Guardado");

    }
}