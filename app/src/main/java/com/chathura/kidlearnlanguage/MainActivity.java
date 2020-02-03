package com.chathura.kidlearnlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To find the Viesw that find the numbers category
        TextView txtNumbers = findViewById(R.id.txtNumbers);
        TextView txtFamilyMembers = findViewById(R.id.txtFamily);
        TextView txtColors = findViewById(R.id.txtColors);
        TextView txtPhrases = findViewById(R.id.txtPhrases);

        //Set Click Listener on that view
        txtNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intent);
            }
        });

        txtFamilyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FamilyActiity.class);
                startActivity(intent);
            }
        });

        txtColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);
            }
        });

        txtPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });


    }


}
