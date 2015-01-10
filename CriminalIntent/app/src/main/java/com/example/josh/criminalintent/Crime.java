package com.example.josh.criminalintent;

import java.util.UUID;

/**
 * Created by Josh on 1/8/2015.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        mID = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getID() {
        return mID;
    }
}
