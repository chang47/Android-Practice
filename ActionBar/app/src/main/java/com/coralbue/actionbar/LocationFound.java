package com.coralbue.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by JoshDesktop on 1/1/2015.
 */
public class LocationFound extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_found);

        // get action bar
        ActionBar actionBar = getActionBar();

        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
