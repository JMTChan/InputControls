package com.chan.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    private View.OnClickListener clickListener = new View.OnClickListener(){
//
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(MainActivity.this, "Icon", Toast.LENGTH_LONG).show();
//        }
//    };
//
//    private View.OnClickListener clickListener1 = new View.OnClickListener(){
//
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(MainActivity.this, "Alarm Icon Left", Toast.LENGTH_LONG).show();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        ImageButton btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

//        btn1.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Alarm", Toast.LENGTH_LONG).show();
//            }
//        });

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        switch (id)
        {
            case R.id.btn1:
                Toast.makeText(this, "Alarm", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                Toast.makeText(this, "ICON", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn3:
                Toast.makeText(this, "Alarm Icon Left", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn4:
                Toast.makeText(this, "Alarm Icon Right", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
