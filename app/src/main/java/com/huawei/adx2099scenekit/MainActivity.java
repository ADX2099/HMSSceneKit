package com.huawei.adx2099scenekit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton =  findViewById(R.id.initScene);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initActivity();
            }
        });

    }

    private void initActivity() {
        Intent theIntent = new Intent(this, SceneViewActivity.class);
        startActivity(theIntent);
    }
}