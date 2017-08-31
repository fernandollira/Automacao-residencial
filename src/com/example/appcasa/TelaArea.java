package com.example.appcasa;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageButton;




public class TelaArea extends Activity 
{
	private boolean ButtonON=true;
	private ClienteHttpGet clienteArea; 
	ImageButton  btnSwitch,btnArea;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	StrictMode.ThreadPolicy policy = new StrictMode.
    	ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaarea);
        
        
        btnArea = (ImageButton) findViewById(R.id.btnSwitch);
        
        btnArea.setOnClickListener(new View.OnClickListener(){
        	
        public void onClick (View v) 
        {
        	if (ButtonON)
        	{
    			clienteArea = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=LigarServico");
    			btnArea.setClickable(true);
    			btnArea.setImageResource(R.drawable.btn_switch_on);
    			ButtonON= false;
    		
        	}else
        	{
    			clienteArea = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=DesligarServico");
    			btnArea.setClickable(true);
    			btnArea.setImageResource(R.drawable.btn_switch_off);
        		ButtonON= true;
        	}
        }
        });
          
    }

}

