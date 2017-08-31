package com.example.appcasa;


import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageButton;




public class TelaCozinha extends Activity 
{
	private boolean ButtonON=true;
	private ClienteHttpGet clienteCozinha; 
	static ImageButton btnCozinha;
	

	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	StrictMode.ThreadPolicy policy = new StrictMode.
    	ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telacozinha);
 
        btnCozinha = (ImageButton) findViewById(R.id.btnSwitch);
        /*
        if (ButtonON)
        {
			btnCozinha.setImageResource(R.drawable.btn_switch_on);
			ButtonON= false;
        }else
        {
			btnCozinha.setImageResource(R.drawable.btn_switch_off);
    		ButtonON= true;
        }
        */
       btnCozinha.setOnClickListener(new View.OnClickListener(){
        	
        public void onClick (View v) 
        {
        	if (ButtonON)
        	{
    			clienteCozinha = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=LigarCozinha");
    			btnCozinha.setClickable(true);
    			btnCozinha.setImageResource(R.drawable.btn_switch_on);
    			ButtonON= false;
    		
        	}else
        	{
    			ClienteHttpGet clienteCozinha = new ClienteHttpGet("http://192.168.1.177:8090/?cmd=DesligarCozinha");
    			btnCozinha.setClickable(true);
    			btnCozinha.setImageResource(R.drawable.btn_switch_off);
        		ButtonON= true;
        	}
        }
        });
          
    }

}

