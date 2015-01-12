package com.example.josh.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by JoshDesktop on 1/12/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
