package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void pere(View view){
        Button but =findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Intent inte =new Intent(MainActivity.this, MainActivity2.class );
        startActivity(inte);
        Toast toast =Toast.makeText(MainActivity.this, "Если ты такой тупой то это новая страница", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.END| Gravity.CENTER_VERTICAL,0,0);
        toast.show();
    }
    public void pere2(View view){
        Button but =findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Intent inte =new Intent(MainActivity.this, MainActivity3.class );
        startActivity(inte);
        Toast toast =Toast.makeText(MainActivity.this, "Вот тебе твои контакты", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.END| Gravity.CENTER_VERTICAL,0,0);
        toast.show();
    }
}

