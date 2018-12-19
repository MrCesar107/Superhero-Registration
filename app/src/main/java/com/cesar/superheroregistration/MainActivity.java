package com.cesar.superheroregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String LAST_NAME = "last_name";
    public static final String HERO_NAME = "hero_name";
    public static final String AGE = "age";
    public static final String ADDRESS = "address";
    public static final String CITY = "city";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText nameEdit = findViewById(R.id.name_edit);
        final EditText lastNameEdit = findViewById(R.id.last_name_edit);
        final EditText heroNameEdit = findViewById(R.id.hero_name_edit);
        final EditText ageEdit = findViewById(R.id.age_edit);
        final EditText addressEdit = findViewById(R.id.address_edit);
        final EditText cityEdit = findViewById(R.id.city_edit);

        Button registrationButton = findViewById(R.id.registration_button);
        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(MainActivity.
                        this, DetailActivity.class);

                final Superheroe ironMan = new Superheroe(nameEdit.getText().toString(),
                        lastNameEdit.getText().toString(), heroNameEdit.getText().toString(),
                        ageEdit.getText().toString(), addressEdit.getText().toString(),
                        cityEdit.getText().toString());


                detailIntent.putExtra(NAME, ironMan.getName());
                detailIntent.putExtra(LAST_NAME, ironMan.getLast_name());
                detailIntent.putExtra(HERO_NAME, ironMan.getHero_name());
                detailIntent.putExtra(AGE, ironMan.getAge());
                detailIntent.putExtra(ADDRESS, ironMan.getAddress());
                detailIntent.putExtra(CITY, ironMan.getCity());


                startActivity(detailIntent);
            }
        });
    }
}
