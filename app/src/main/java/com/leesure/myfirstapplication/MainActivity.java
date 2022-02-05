package com.leesure.myfirstapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 运行时,Java会覆盖xml的设置
        TextView view = findViewById(R.id.text1);
        view.setText("first Android");
    }
}