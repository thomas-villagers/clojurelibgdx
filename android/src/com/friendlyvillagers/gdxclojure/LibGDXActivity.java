package com.friendlyvillagers.gdxclojure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent; 
import android.os.Handler;
import android.view.Window;

public class LibGDXActivity extends Activity {

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE); 
    setContentView(R.layout.main);
    
    Handler h = new Handler();
    Runnable r = new Runnable(){
	public void run()
	{
	  try {
	    Class.forName("clojure.lang.RT");
	  } catch (Exception e)
	    {		
	      System.out.println("clojure.lang.RT not found!");
	    }		
	  Intent intent = new Intent(LibGDXActivity.this, GameActivity.class);
	  intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	  startActivity(intent);  
	  LibGDXActivity.this.finish();
	}};
	h.postDelayed(r,50);
  }  
}
