package com.roquines.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView Pantalla ;
    String Resultado;
    float Num1 ;
    float Opera;
    String tipoOpera;
    Button uno, dos, tres , cuatro ,cinco , seis , siete , ocho, nueve , cero , punto , igual, mas , menos, por, div; 
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        uno = (Button) findViewById(R.id.button1);
        dos = (Button) findViewById(R.id.button2);
        tres = (Button) findViewById(R.id.button3);
        cuatro = (Button) findViewById(R.id.button4);
        cinco = (Button) findViewById(R.id.button5);
        seis = (Button) findViewById(R.id.button6);
        siete = (Button) findViewById(R.id.button7);
        ocho = (Button) findViewById(R.id.button8);
        nueve = (Button) findViewById(R.id.button9);
        cero = (Button) findViewById(R.id.buttoncero);
        punto = (Button) findViewById(R.id.buttonpunto);
        igual = (Button) findViewById(R.id.buttonigual);
        mas = (Button) findViewById(R.id.buttonmas);
        menos = (Button) findViewById(R.id.buttonmenos);
        por = (Button) findViewById(R.id.buttonpor);
        div = (Button) findViewById(R.id.buttondiv);
        
        Pantalla = (TextView) findViewById(R.id.textView1);
        
        uno.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) uno.getText() );
			}
        });
        dos.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) dos.getText() );
			}
        });
        tres.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) tres.getText() );
			}
        });
        cuatro.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) cuatro.getText() );
			}
        });
        cinco.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) cinco.getText() );
			}
        });
        seis.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) seis.getText() );
			}
        });
        siete.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) siete.getText() );
			}
        });
        ocho.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) ocho.getText() );
			}
        });
        nueve.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) nueve.getText() );
			}
        });
        cero.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) cero.getText() );
			}
        });
        punto.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resultado =(String) Pantalla.getText();
				Pantalla.setText((String) Resultado + (String) punto.getText() );
			}
        });
        
        mas.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				tipoOpera="suma";
				Num1 = Float.valueOf(Pantalla.getText().toString());
				Pantalla.setText("");
				
			}
        });
        menos.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				tipoOpera="resta";
				Num1 = Float.valueOf( Pantalla.getText().toString());
				Pantalla.setText("");
			}
        });
        por.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tipoOpera="por";
				Num1 = Float.valueOf( Pantalla.getText().toString());
				Pantalla.setText("");

			}
        });
        div.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tipoOpera="div";
				Num1 = Float.valueOf( Pantalla.getText().toString());
				Pantalla.setText("");

			}
        });
        
        igual.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tipoOpera == "suma"){
					Opera = Num1 + Float.valueOf( Pantalla.getText().toString());
				}else if (tipoOpera =="resta"){
					Opera = Num1 - Float.valueOf( Pantalla.getText().toString());
				}else if (tipoOpera =="div"){
					Opera = Num1 / Float.valueOf( Pantalla.getText().toString());
				}else if (tipoOpera =="por"){
					Opera = Num1 * Float.valueOf( Pantalla.getText().toString());
				}
				
				Pantalla.setText(Float.toString(Opera));
				Num1= 0; 
			}
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
