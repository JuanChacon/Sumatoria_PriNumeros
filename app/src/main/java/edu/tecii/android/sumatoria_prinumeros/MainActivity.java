package edu.tecii.android.sumatoria_prinumeros;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;



public class MainActivity extends AppCompatActivity {

    Button btnS;
    EditText txtNum;
    private EditText NumEntero;
    private TextView Resultado;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumatoria();
        btnS.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String valor1 = NumEntero.getText().toString();
                int num = Integer.parseInt(valor1);
                int suma = num * (num + 1) / 2;
                String resul = "";
                String s=String.valueOf(suma);
                resul = "La suma de los " + num + " primeros numeros enteros es:" + suma ;
                Resultado.setText(resul);
            }
        });

    }

    public void sumatoria() {
        NumEntero = (EditText) findViewById(R.id.txtNum);
        Resultado = (TextView) findViewById(R.id.resul);
        btnS = (Button)findViewById(R.id.btnSuma);

    }

}

