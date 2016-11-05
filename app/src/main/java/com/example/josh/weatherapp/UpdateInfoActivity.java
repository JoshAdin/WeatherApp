package com.example.josh.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateInfoActivity extends AppCompatActivity {


    /**
     * Holds current city name
     */
    private String city;

    /**
     * Method refreshes the current city weather info
     */
    public void refresh(View view) {
        updateCurrentActivity();
    }

    /**
     * This method updates all textviews this activity (UpdateInfoActivity.this).
     * TODO:Update
     * Current Temp, Date, Day, Max Temp, Min Temp and other weather features to be added.
     * Main method to be focused on while using the JSON.
     * Get on more TextView names from the Design view of activity_update_info.xml
     */
    public void updateCurrentActivity() {
        //Update cityName here
        TextView cityNameTxtView = (TextView) findViewById(R.id.cityNameTxtView);
        cityNameTxtView.setText(city);
    }

    /**
     * Create and initializes all activities for the current class
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);

        //Get the intent that brought the user to this activity. The intent will be
        // the variables parsed from the previous activity.
        Intent intent = getIntent();
        city = intent.getStringExtra("cityName");

        updateCurrentActivity();

        //quick toast for test if get update pulls a city from spinner
        //Toast.makeText(this, intent.getStringExtra("cityName"), Toast.LENGTH_SHORT).show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_update_info, menu);
        return true;
    }


    /**
     * This methods calls the change location menu. Returns true if Change Setting menu is tapped
     *
     * @param menuItem
     * @return true if tapped else false
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = menuItem.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.change_cityId) {
            return true;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}

