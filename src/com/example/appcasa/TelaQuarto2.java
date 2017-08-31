package com.example.appcasa;


import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageButton;




public class TelaQuarto2 extends Activity 
{
	private boolean ButtonON=true;
	private ClienteHttpGet clienteQuarto2; 
	ImageButton btnSwitch,btnQuarto2;
	

	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	StrictMode.ThreadPolicy policy = new StrictMode.
    	ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaquarto2);
        
        
        btnQuarto2 = (ImageButton) findViewById(R.id.btnSwitch);
        
        
        
        btnQuarto2.setOnClickListener(new View.OnClickListener(){
        	
        public void onClick (View v) 
        {
        	if (ButtonON)
        	{
        		clienteQuarto2 = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=LigarSala");
        		btnQuarto2.setClickable(true);
        		btnQuarto2.setImageResource(R.drawable.btn_switch_on);
    			ButtonON= false;
    		
        	}else
        	{
        		clienteQuarto2 = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=DesligarSala");
        		btnQuarto2.setClickable(true);
        		btnQuarto2.setImageResource(R.drawable.btn_switch_off);
        		ButtonON= true;
        	}
        }
        });
          
    }

}

