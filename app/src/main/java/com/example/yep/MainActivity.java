package com.example.yep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityMain2();
            }

        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityMain3();
            }

        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityMain4();
            }

        });


    }

    public void openActivityMain2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivityMain3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivityMain4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}