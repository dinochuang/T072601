package com.example.student.t072601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        //Button btn = new Button(MainActivity.this);
        //btn.setText("Click Me!");
        //setContentView(btn);

        LinearLayout layout = new LinearLayout(MainActivity.this);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        1.0f);

        Button btn1 = new Button(MainActivity.this);
        btn1.setLayoutParams(params);
        btn1.setText("Btn 1");
        layout.addView(btn1);
        Button btn2 = new Button(MainActivity.this);
        btn2.setLayoutParams(params);
        btn2.setText("Btn 2");
        layout.addView(btn2);
        Button btn3 = new Button(MainActivity.this);
        btn3.setLayoutParams(params);
        btn3.setText("Btn 3");
        layout.addView(btn3);

        setContentView(layout);
    }
}
