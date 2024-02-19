package com.example.myapplication1;

import static com.example.myapplication1.MainActivity.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //TextView textView = new TextView(this);
        TextView textView = findViewById(R.id.textView2);


        Bundle bundle = getIntent().getExtras();
        String res = bundle.getString(KEY);

        textView.setText(res);
    }

}