package com.example.alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thong bao");
                builder.setMessage("Ban vua click vao button");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {//PositiveButton khang dinh
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {//NegativeButton phu dinh
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog d = builder.create();
                d.show();
            }
        });
    }

}
