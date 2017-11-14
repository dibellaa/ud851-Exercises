package com.example.android.explicitintent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by adibella on 10/11/2017.
 */

public class ChildActivity extends AppCompatActivity {
    private TextView mDisplay;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplay = (TextView) findViewById(R.id.tv_display);
    }
}
