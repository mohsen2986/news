package com.example.newsitemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.img);
        View empty = findViewById(R.id.container);
        View scrollView = findViewById(R.id.scroll_view);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.img:
                        Toast.makeText(MainActivity.this, "img", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.container:
                        Toast.makeText(MainActivity.this, "container", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.scroll_view:
                        Toast.makeText(MainActivity.this, "empty", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        img.setOnClickListener(listener);
        empty.setOnClickListener(listener);
        scrollView.setOnClickListener(listener);
    }
}
