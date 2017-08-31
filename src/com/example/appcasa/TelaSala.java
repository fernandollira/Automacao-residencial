package com.example.appcasa;


import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageButton;




public class TelaSala extends Activity 
{
	private boolean ButtonON=true;
	private ClienteHttpGet clienteSala; 
	ImageButton  btnSwitch,btnSala;
	

	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	StrictMode.ThreadPolicy policy = new StrictMode.
    	ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telasala);
        
        
        btnSala = (ImageButton) findViewById(R.id.btnSwitch);
        
        btnSala.setOnClickListener(new View.OnClickListener(){
        	
        public void onClick (View v) 
        {
        	if (ButtonON)
        	{
    			clienteSala = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=LigarSala");
    			btnSala.setClickable(true);
    			btnSala.setImageResource(R.drawable.btn_switch_on);
    			ButtonON= false;
    		
        	}else
        	{
    			clienteSala = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=DesligarSala");
    			btnSala.setClickable(true);
    			btnSala.setImageResource(R.drawable.btn_switch_off);
        		ButtonON= true;
        	}
        }
        });
          
    }

}

