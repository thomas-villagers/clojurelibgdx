package com.friendlyvillagers.gdxclojure;

import android.app.Activity;
import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import clojure.gdx.MyGame;

public class LibGDXActivity extends AndroidApplication
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
	initialize(new MyGame(), true);
    }
}
