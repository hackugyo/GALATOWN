
package com.hackugyo.galatown.app.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.hackugyo.galatown.app.ui.fragment.SampleFragment;
import com.hackugyo.galatown.app.ui.fragment.TopFragment;

public class ViewPagerAdapter
    extends FragmentPagerAdapter
{

    private String[] locations;

    public ViewPagerAdapter(FragmentManager fm, String[] locations) {
        super(fm);
        this.locations = locations;
    }

    public int getCount() {
        return locations.length;
    }

    public Fragment getItem(int position) {
        Fragment fragment;
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                fragment = new TopFragment();
                bundle.putString("label", locations[position]);
                fragment.setArguments(bundle);
                break;
            default:
                fragment = new SampleFragment();
                bundle.putString("label", locations[position]);
                fragment.setArguments(bundle);
                break;
        }
        return fragment;
    }

}
