package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvinfo1, tvinfo2, tvinfo3, tvinfo4, tvinfo5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvinfo1 = (TextView) findViewById(R.id.tv_info1);
        tvinfo2 = (TextView) findViewById(R.id.tv_info2);
        tvinfo3 = (TextView) findViewById(R.id.tv_info3);
        tvinfo4 = (TextView) findViewById(R.id.tv_info4);
        tvinfo5 = (TextView) findViewById(R.id.tv_info5);

       Vehicle v1 = new Vehicle("Test");
       Car c1 = new Car("V2","Toyota");



       Motorcycle def = new Motorcycle("70cc");

       Mercedes xyz = new one("s600");

       Testing ghi = new Testing();

       tvinfo1.setText(v1.toString());
       tvinfo2.setText(c1.toString());
       tvinfo3.setText(xyz.toString());
       tvinfo4.setText(def.toString());
       tvinfo5.setText(ghi.toString());

    }
}