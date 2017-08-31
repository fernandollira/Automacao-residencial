package com.example.appcasa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class Menuapp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menutelas);
    
    
    Button botaoLuzCozinha = (Button) findViewById(R.id.bLuzCozinha);
    Button botaoLuzSala = (Button) findViewById(R.id.bLuzSala);
    Button botaoLuzQuarto = (Button) findViewById(R.id.bLuzQuarto);
    Button botaoLuzArea = (Button) findViewById(R.id.bLuzArea);
    Button botaoLuzQuarto2 = (Button) findViewById(R.id.bLuzQuarto2);
    
    botaoLuzCozinha.setOnClickListener(new View.OnClickListener()
    {
        
     @Override
    public void onClick(View v) 
    {
        Intent intent = new Intent();
        intent.setClass(Menuapp.this,TelaCozinha.class);
        
        startActivity(intent);
    }
    });
    
    botaoLuzQuarto.setOnClickListener(new View.OnClickListener()
    {
        
     @Override
    public void onClick(View v) 
    {
        Intent intent = new Intent();
        intent.setClass(Menuapp.this,TelaQuarto.class);
        
        startActivity(intent);
    }
    });
    
    botaoLuzQuarto2.setOnClickListener(new View.OnClickListener()
    {
        
     @Override
    public void onClick(View v) 
    {
        Intent intent = new Intent();
        intent.setClass(Menuapp.this,TelaQuarto2.class);
        
        startActivity(intent);
    }
    });
    
    botaoLuzSala.setOnClickListener(new View.OnClickListener()
    {
        
     @Override
    public void onClick(View v) 
    {
        Intent intent = new Intent();
        intent.setClass(Menuapp.this,TelaSala.class);
        
        startActivity(intent);
    }
    });
    
    botaoLuzArea.setOnClickListener(new View.OnClickListener()
    {
        
     @Override
    public void onClick(View v) 
    {
        Intent intent = new Intent();
        intent.setClass(Menuapp.this,TelaArea.class);
        
        startActivity(intent);
    }
    });

    }
}


    
