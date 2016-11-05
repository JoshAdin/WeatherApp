package com.example.josh.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * City selected from drop down
     */
    private String city;

    /**
     * This method changes to the next UI activity to get weather update for the selected location
     * when the GET UPDATE button is tapped. The variable from the spinner(drop down) are also passes to the
     * next activity
     *
     * @param view
     */
    public void getUpdate(View view) {

        Spinner cityFromSpinner = (Spinner) findViewById(R.id.citySpinner);

        city = cityFromSpinner.getSelectedItem().toString();

        //quick toast for test if get update pulls a city from spinner
        //Toast.makeText(getApplicationContext(),selectedCity.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();

        //pass city selected to the next UI activity and start activity
        Intent intent = new Intent(getApplicationContext(), UpdateInfoActivity.class);
        intent.putExtra("cityName", city);
        startActivity(intent);

    }

    /**
     * Create and initializes all activities for the current class
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
