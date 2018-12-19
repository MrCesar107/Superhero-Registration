package com.cesar.superheroregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString(MainActivity.NAME);
        String last_name = extras.getString(MainActivity.LAST_NAME);
        String hero_name = extras.getString(MainActivity.HERO_NAME);
        String age = extras.getString(MainActivity.AGE);
        String address = extras.getString(MainActivity.ADDRESS);
        String city = extras.getString(MainActivity.CITY);

        TextView heroData = findViewById(R.id.hero_data);
        heroData.setText(name + ", " + last_name + ", " + hero_name + ", " + age + ", " + address + ", " + city);
    }
}
