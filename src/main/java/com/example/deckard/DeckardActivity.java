package com.example.deckard;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DeckardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deckard);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.deckard, menu);
        return true;
    }
    
}
