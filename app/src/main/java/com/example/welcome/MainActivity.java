package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button reset;
    //Button lancia;
    Button btnTest;
    TextView lblTesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        reset=(Button)findViewById(R.id.reset);//gli assegno l'id del bottone reset della activity
        btnTest = (Button)findViewById(R.id.Testo);//gli assegno l'id del bottone Testo della activity
      
        lblTesto = (TextView)findViewById(R.id.PlainName);
    }

    public void lan(View v){
        Intent i = new Intent(getApplicationContext(),secondaact.class);
        i.putExtra("etichetta",lblTesto.getText());
    }

    public void test(View v){//Toast è una classe astratta
        Toast t=Toast.makeText(getApplicationContext(),"ciao", Toast.LENGTH_LONG);
        t.show();//lancia il comando Toast
    }
    
    public void reset(View V)
    {
     lblTesto.setText("");
    }
}