package com.chathura.kidlearnlanguage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class NumbersActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();

        int j = 0;


        while (j<=1000){
            numbers.add("Another Number");
            j++;
        }




        //Log.v("NumbersActiity","Number at index"+numbers.get(0));


        //Using Array Adapter
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,R.layout.list_item,numbers);

        ListView rootView = findViewById(R.id.rootView);
        rootView.setAdapter(itemsAdapter);

    }
}
