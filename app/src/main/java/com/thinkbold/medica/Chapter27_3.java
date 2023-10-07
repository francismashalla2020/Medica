package com.thinkbold.medica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class Chapter27_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter27_3);
        Button buttonProceed = findViewById(R.id.buttonProceed);
        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Chapter27_4.class));
            }
        });

        ImageView imageBack=findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView menusT = findViewById(R.id.menuST);
        menusT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Chapter27_3.this, v);
                popupMenu.setOnMenuItemClickListener(Chapter27_3.this::onMenuItemClick);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();

            }
        });
    }

    public boolean onMenuItemClick (MenuItem item){
        switch (item.getItemId()){
            case R.id.appInfo:
                startActivity(new Intent(getApplicationContext(), AppInfo.class));
                return true;
            case R.id.docs:
                startActivity(new Intent(getApplicationContext(), Docs.class));
                return true;
            case R.id.appTopics:
                startActivity(new Intent(getApplicationContext(), Navigation.class));
                return true;
            case R.id.feed:
                startActivity(new Intent(getApplicationContext(), Feedback.class));
                return true;

            default:
                return false;
        }
    }
}