
package com.hackugyo.galatown.app.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hackugyo.galatown.app.R;

public class SampleFragment
    extends Fragment
{

    private TextView labelText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_sample, container, false);
        labelText = ((TextView) contentView.findViewById(R.id.label_text));
        Bundle bundle = getArguments();
        String label = bundle.getString("label");
        labelText.setText(label);
        return contentView;
    }

}
