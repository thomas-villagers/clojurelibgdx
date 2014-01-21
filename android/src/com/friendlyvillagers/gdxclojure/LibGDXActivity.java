package com.friendlyvillagers.gdxclojure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent; 
import android.os.AsyncTask;
import android.view.Window;

public class LibGDXActivity extends Activity {


 private class LoadClojureTask extends AsyncTask<Void, Void, Void> 
  {
    @Override
      protected  Void doInBackground(Void... v)
    {
      try {
	Class.forName("clojure.lang.RT");
      } catch (Exception e)
	{		
	  System.out.println("clojure.lang.RT not found!");
	}		
      return null;
    }
    
    @Override
      protected void onPostExecute(Void v)
    {
      Intent intent = new Intent(LibGDXActivity.this, GameActivity.class);
      intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
      startActivity(intent);
      LibGDXActivity.this.finish();
     
    }
  }

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE); 
    setContentView(R.layout.main);
    LoadClojureTask task = new LoadClojureTask();
    task.execute();
  }  
}
