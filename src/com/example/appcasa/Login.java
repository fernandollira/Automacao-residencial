package com.example.appcasa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Login extends Activity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginapp);
    
    
    Button botaoEntrar = (Button) findViewById(R.id.bEntra);

    botaoEntrar.setOnClickListener(new View.OnClickListener()
    {
        
     @Override
    public void onClick(View v) 
    {
        Intent intent = new Intent();
        intent.setClass(Login.this,Menuapp.class);
        
        startActivity(intent);
    }
    });
    }
                        

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
