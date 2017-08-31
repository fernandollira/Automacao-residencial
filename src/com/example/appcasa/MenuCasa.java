package com.example.appcasa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenuCasa extends Activity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        getMenuInflater().inflate(R.menu.menucasa, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
        case R.id.LuzSala:
     
        	Intent intent = new Intent();
            intent.setClass(MenuCasa.this,TelaSecundaria.class);
            
            startActivity(intent);
        	
             
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}