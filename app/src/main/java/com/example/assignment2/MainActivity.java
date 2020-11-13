package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public abstract class MainActivity extends AppCompatActivity implements fragmenta.listnera{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fTrans = fm.beginTransaction();
        fragmenta FA = new fragmenta();
        fragmentb Fb = new fragmentb();
        fTrans.add(R.id.fl1, Fb);
        fTrans.add(R.id.fl2, FA);
        fTrans.commit();
    }

    @Override
    public void senddata(int val) {
        FragmentManager fm = getSupportFragmentManager();
        fragmentb Fb = new fragmentb();
        Fb.doanimation(val);
    }
}