package com.example.appcasa;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageButton;




public class TelaQuarto extends Activity 
{
	private boolean ButtonON=true;
	private ClienteHttpGet clienteQuarto; 
	ImageButton btnSwitch,btnQuarto;
	

	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	StrictMode.ThreadPolicy policy = new StrictMode.
    	ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaquarto);
        
        
        btnQuarto = (ImageButton) findViewById(R.id.btnSwitch);
        
        
        
        btnQuarto.setOnClickListener(new View.OnClickListener(){
        	
        public void onClick (View v) 
        {
        	if (ButtonON)
        	{
        		clienteQuarto = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=LigarQuarto");
        		btnQuarto.setClickable(true);
        		btnQuarto.setImageResource(R.drawable.btn_switch_on);
    			ButtonON= false;
    		
        	}else
        	{
        		clienteQuarto = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=DesligarQuarto");
        		btnQuarto.setClickable(true);
        		btnQuarto.setImageResource(R.drawable.btn_switch_off);
        		ButtonON= true;
        	}
        }
        });
          
    }

}