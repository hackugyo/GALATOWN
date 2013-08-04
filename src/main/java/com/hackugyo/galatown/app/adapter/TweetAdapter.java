package com.hackugyo.galatown.app.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;
import twitter4j.Status;

/**
 * Created with IntelliJ IDEA.
 * User: hackugyo
 * Date: 13/08/04
 * Time: 12:57
 */
public class TweetAdapter extends ArrayAdapter<Status> {
    public TweetAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }
}
