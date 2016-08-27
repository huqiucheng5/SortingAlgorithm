package com.hu.sortingalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hu.sortingalgorithm.tools.DirectInsertionSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DirectInsertionSort().insertSort();
    }
}
