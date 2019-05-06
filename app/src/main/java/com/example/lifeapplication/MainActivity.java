package com.example.lifeapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);
        text.setText("更改了");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        Log.e(TAG, "onCreate:执行了！！ ");
        Log.e(TAG, "onCreate:执行了！！ ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart:执行了 ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart:执行了 ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume:执行了 ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop:执行了 ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause:执行了 ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy:执行了 ");
    }
}
