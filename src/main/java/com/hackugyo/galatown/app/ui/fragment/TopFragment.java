
package com.hackugyo.galatown.app.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.hackugyo.galatown.app.R;

public class TopFragment
        extends Fragment
{

    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_top, container, false);
        Bundle bundle = getArguments();
        String label = bundle.getString("label");

        setupListView(contentView, bundle);

        return contentView;
    }

    /**
     * Private view creating methods
     */
    /**
     *
     * @param contentView
     * @param bundle
     */
    private ListView setupListView(View contentView, Bundle bundle) {
        mListView = (ListView) contentView.findViewById(R.id.TopFragment_ListView);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });

        return mListView;
    }

}
