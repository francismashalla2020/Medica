package com.thinkbold.medica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.Calendar;

public class Navigation extends AppCompatActivity {
    TextView greetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        ImageView imageBack=findViewById(R.id.imageBack);
        greetings = findViewById(R.id.greetings);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
            greetings.setText(R.string.goodmorning);
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            greetings.setText(R.string.goodA);
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            greetings.setText(R.string.goodE);
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            greetings.setText(R.string.goodE);
        }


        ImageView menusT = findViewById(R.id.menuST);
        menusT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Navigation.this, v);
                popupMenu.setOnMenuItemClickListener(Navigation.this::onMenuItemClick);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();

            }
        });
    }

    public void navButtons(View view) {
        switch (view.getId()){
            case R.id.nav0:
                startActivity(new Intent(getApplicationContext(), HowTo.class));
                break;
            case R.id.nav1:
                startActivity(new Intent(getApplicationContext(), ChaptersOne.class));
                break;
            case R.id.nav2:
                startActivity(new Intent(getApplicationContext(), ChapterTwo.class));
                break;
            case R.id.nav3:
                startActivity(new Intent(getApplicationContext(), Chapter3.class));
                break;
            case R.id.nav4:
                startActivity(new Intent(getApplicationContext(), Chapter4.class));
                break;
            case R.id.nav5:
                startActivity(new Intent(getApplicationContext(), Chapter5.class));
                break;
            case R.id.nav6:
                startActivity(new Intent(getApplicationContext(), Chapter6.class));
                break;
            case R.id.nav7:
                startActivity(new Intent(getApplicationContext(), Chapter7.class));
                break;
            case R.id.nav8:
                startActivity(new Intent(getApplicationContext(), Chapter8.class));
                break;
            case R.id.nav9:
                startActivity(new Intent(getApplicationContext(), Chapter9.class));
                break;
            case R.id.nav10:
                startActivity(new Intent(getApplicationContext(), Chapter10.class));
                break;
            case R.id.nav11:
                startActivity(new Intent(getApplicationContext(), Chapter11.class));
                break;
            case R.id.nav12:
                startActivity(new Intent(getApplicationContext(), Chapter12.class));
                break;
            case R.id.nav13:
                startActivity(new Intent(getApplicationContext(), Chapter13.class));
                break;
            case R.id.nav14:
                startActivity(new Intent(getApplicationContext(), Chapter14.class));
                break;
            case R.id.nav15:
                startActivity(new Intent(getApplicationContext(), Chapter15.class));
                break;
            case R.id.nav16:
                startActivity(new Intent(getApplicationContext(), Chapter16.class));
                break;
            case R.id.nav17:
                startActivity(new Intent(getApplicationContext(), Chapter17.class));
                break;
            case R.id.nav18:
                startActivity(new Intent(getApplicationContext(), Chapter18.class));
                break;
            case R.id.nav19:
                startActivity(new Intent(getApplicationContext(), Chapter19.class));
                break;
            case R.id.nav20:
                startActivity(new Intent(getApplicationContext(), Chapter20.class));
                break;
            case R.id.nav21:
                startActivity(new Intent(getApplicationContext(), Chapter21.class));
                break;
            case R.id.nav22:
                startActivity(new Intent(getApplicationContext(), Chapter22.class));
                break;
            case R.id.nav23:
                startActivity(new Intent(getApplicationContext(), Chapter23.class));
                break;
            case R.id.nav24:
                startActivity(new Intent(getApplicationContext(), Chapter24.class));
                break;
            case R.id.nav25:
                startActivity(new Intent(getApplicationContext(), Chapter25.class));
                break;
            case R.id.nav26:
                startActivity(new Intent(getApplicationContext(), Chapter26.class));
                break;
            case R.id.nav27:
                startActivity(new Intent(getApplicationContext(), Chapter27.class));
                break;
            case R.id.nav28:
                startActivity(new Intent(getApplicationContext(), Chapter28.class));
                break;
            default:
        }
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