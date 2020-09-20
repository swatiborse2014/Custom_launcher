package com.example.customlauncher.activity;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.example.customlauncher.R;
import com.example.customlauncher.fragment.AppListFragment;

public class HomePageActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Fragment fragment = new AppListFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_frame, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }
}