package com.example.app_mid_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void but_click(View view){
        EditText edn=findViewById(R.id.editTextNumberDecimal);
        EditText edn2=findViewById(R.id.editTextNumberDecimal2);
        GV gv=(GV) getApplicationContext();
        gv.setH(edn.getText().toString());
        gv.setW(edn2.getText().toString());
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}