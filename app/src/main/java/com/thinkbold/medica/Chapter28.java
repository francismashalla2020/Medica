package com.thinkbold.medica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class Chapter28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter28);
        Button att1 = findViewById(R.id.att1);
        Button att2 = findViewById(R.id.att2);
        att1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Chapter28_1.class));
            }
        });
        att2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Chapter28_2.class));
            }
        });

        ImageView imageBack=findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.att3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FN2TR-aaW4IFXrMHlzEohZFXsf23sHm1/view?usp=sharing")));
            }
        });

        ImageView menusT = findViewById(R.id.menuST);
        menusT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Chapter28.this, v);
                popupMenu.setOnMenuItemClickListener(Chapter28.this::onMenuItemClick);
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