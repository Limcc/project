package com.example.fragment_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_frag1, bt_frag2, bt_frag3, bt_frag4, bt_frag5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_frag1 = (Button)findViewById(R.id.bt_frag1);
        bt_frag2 = (Button)findViewById(R.id.bt_frag2);
        bt_frag3 = (Button)findViewById(R.id.bt_frag3);
        bt_frag4 = (Button)findViewById(R.id.bt_frag4);
        bt_frag5 = (Button)findViewById(R.id.bt_frag5);

        final Fragment1 fragment1 = new Fragment1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_container, fragment1);
        fragmentTransaction.commit();

        bt_frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(Fragment1.newnstance());
            }
        });

        bt_frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(Fragment2.newnstance());
            }
        });

        bt_frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(Fragment3.newnstance());
            }
        });

        bt_frag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(Fragment4.newnstance());
            }
        });

        bt_frag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(Fragment5.newnstance());
            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,fragment).commit();
    }
}
