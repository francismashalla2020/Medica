package com.thinkbold.medica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Docs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docs);

        findViewById(R.id.faragha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1SJtxA9J6hy7oOQ0bGcb96N-WNJDtqiOo/view?usp=sharing")));
            }
        });

        findViewById(R.id.kanusho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tO3fua0Ih090zo27Acj5sBdAPH-ozCGK/view?usp=sharing")));
            }
        });
    }
}