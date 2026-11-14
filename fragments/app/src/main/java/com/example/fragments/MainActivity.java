package com.example.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button it_btn, cs_btn,is_btn;
        it_btn =findViewById(R.id.it_button);
        cs_btn =findViewById(R.id.cs_button);
        is_btn =findViewById(R.id.is_button);

        it_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragMan =getSupportFragmentManager();
                fragMan.beginTransaction().replace(R.id.fragmentContainerView,FirstFragment.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        cs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragMan =getSupportFragmentManager();
                fragMan.beginTransaction().replace(R.id.fragmentContainerView,SecondFragment.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        is_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragMan =getSupportFragmentManager();
                fragMan.beginTransaction().replace(R.id.fragmentContainerView,ThirdFragment.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

    }
}