
package com.hackugyo.galatown.app.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.ArrayAdapter;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.hackugyo.galatown.app.R;
import com.hackugyo.galatown.app.adapter.ViewPagerAdapter;

public class TopActivity
        extends SherlockFragmentActivity
        implements OnPageChangeListener, OnNavigationListener
{

    private String[] locations;
    private ViewPager pager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locations = getResources().getStringArray(R.array.locations);
        pager = ((ViewPager) findViewById(R.id.pager));
        configureViewPager();
        configureActionBar();
    }

    private void configureViewPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), locations);
        pager.setAdapter(viewPagerAdapter);
        pager.setOnPageChangeListener(this);
    }

    /**
     * {@link OnPageChangeListener#onPageSelected(int)} method.
     * @param position
     */
    @Override
    public void onPageSelected(int position) {
        getSupportActionBar().setSelectedNavigationItem(position);
    }

    private void configureActionBar() {
        Context context = getSupportActionBar().getThemedContext();
        ArrayAdapter<CharSequence> list = ArrayAdapter.createFromResource(context, R.array.locations, (android.R.layout.simple_list_item_1));
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        getSupportActionBar().setListNavigationCallbacks(list, this);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        pager.setCurrentItem(itemPosition);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

    @Override
    public void onPageScrollStateChanged(int position) {}
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
}
