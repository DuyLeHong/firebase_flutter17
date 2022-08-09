package com.example.firebase_flutter17;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import io.flutter.embedding.android.FlutterActivity;

public class TestActivity extends FlutterActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //throw new RuntimeException("Test Crash");

        String mess = "Hello CodeFresher!";

        Toast.makeText(getApplicationContext(), mess, Toast.LENGTH_SHORT).show();
    }
}
