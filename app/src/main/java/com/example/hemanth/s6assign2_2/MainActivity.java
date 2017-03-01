package com.example.hemanth.s6assign2_2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.button);
//        Button button1 = (Button)findViewById(R.id.button2);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                Layout1 layout1 = new Layout1();
//                fragmentTransaction.add(R.id.container, layout1);
//                fragmentTransaction.commit();
//            }
//        });
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        Layout1 layout1 = new Layout1();
//        fragmentTransaction.add(R.id.container,layout1);
//        fragmentTransaction.commit();
//    }
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                Layout2 layout2 = new Layout2();
//                fragmentTransaction.add(R.id.container, layout2);
//                fragmentTransaction.commit();
//            }
//        });

    }
    public void ChangeScreen(View view){

        if(view == findViewById(R.id.button)){
            FragmentManager fragmentManager = getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Layout1 layout1 = new Layout1();
                fragmentTransaction.replace(R.id.container, layout1);
                fragmentTransaction.commit();
        }
        if(view == findViewById(R.id.button2)){
            FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Layout2 layout2 = new Layout2();
                fragmentTransaction.replace(R.id.container, layout2);
                fragmentTransaction.commit();
        }
        if(view==findViewById(R.id.button3)){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Layout3 layout3 = new Layout3();
            fragmentTransaction.replace(R.id.container, layout3);
            fragmentTransaction.commit();
        }
        if (view==findViewById(R.id.button4)){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Layout4 layout4 = new Layout4();
            fragmentTransaction.replace(R.id.container, layout4);
            fragmentTransaction.commit();
        }
    }
}