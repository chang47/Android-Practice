package com.example.josh.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by Josh on 1/18/2015.
 */
public class CrimePagerActivity extends FragmentActivity {
    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);
        
    }
}
