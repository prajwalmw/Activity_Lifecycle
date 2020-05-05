package com.prajwal.activitylifecycle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.Delayed;

public class MainActivity extends AppCompatActivity {
    Button button;
    AlertDialog alertDialog;
    AlertDialog.Builder alBuilder;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() is called...");
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Screen_2.class);
                startActivity(i);

            /*  alBuilder = new AlertDialog.Builder(MainActivity.this)
                      .setTitle("Title")
                      .setMessage("This is message")
                      .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialogInterface, int i) {

                          }
                      });
              alertDialog = alBuilder.create();
              alertDialog.show();*/

            /*TextView textView = new TextView(MainActivity.this);
            textView.setText("HElllo");
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.addContentView(textView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                dialog.show();*/
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(this, "onStart() is called...", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart() is called...");

    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(this, "onResume() is called...", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume() is called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Toast.makeText(this, "onPause() is called...", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause() is called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Toast.makeText(this, "onStop() is called...", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop() is called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Toast.makeText(this, "onDestroy() is called...", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy() is called...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        Toast.makeText(this, "oneRestart() is called...", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart() is called...");

    }
}
