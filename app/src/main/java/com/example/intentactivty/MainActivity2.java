package com.example.intentactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.secondActivityEditText);
        button = findViewById(R.id.secondActivityButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = getIntent().getBundleExtra("firstActivityData");
                Toast.makeText(getApplicationContext(), b.getString("bundle") + " "+ editText.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}