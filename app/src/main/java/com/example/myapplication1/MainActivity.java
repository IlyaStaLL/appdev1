package com.example.myapplication1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        if(v.getId() == R.id.button2) {
            EditText edittext = findViewById(R.id.editTextText);
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra(KEY,"Hi!");
            startActivity(intent);
            //======================
            /*Intent intent = new Intent(Intent.ACTION_VIEW);
            String www = "https://mirea.ru";
            intent.setData(Uri.parse(www));
            startActivity(intent);*/
        } else {

        }
    }

}
