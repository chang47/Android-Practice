package com.example.josh.criminalintent;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.UUID;

//Not used, look at CrimePagerActivity
public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        UUID crimeId = (UUID)getIntent().
                getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
