package com.example.josh.weatherapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.josh.weatherapp.model.City;
import com.example.josh.weatherapp.model.CityDAO;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ibm.mobilefirstplatform.clientsdk.android.core.api.BMSClient;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    /**
     * City selected from drop down
     */
    private String city;

    private GoogleMap mMap;

    private String username;
    private String password;

    private Marker currentMarker = null;
    Spinner citySpinner;
    LatLng currentLocation;




    public void displayMap(View view){

        Intent intent = new Intent(this, MapsActivity.class);
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


        // Core SDK must be initialized to interact with Bluemix mobile services
        BMSClient.getInstance().initialize(getApplicationContext(), BMSClient.REGION_US_SOUTH);


        citySpinner = (Spinner) findViewById(R.id.citySpinner);

        ArrayAdapter<City>  spinnerArrayAdapter = new ArrayAdapter<City>(this, android.R.layout.simple_spinner_item, CityDAO.getCities());
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citySpinner.setAdapter(spinnerArrayAdapter);

        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, final int i, long l) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        weatherUpdate((City) adapterView.getSelectedItem());
                        //Toast.makeText(MainActivity.this, "selected "+i, Toast.LENGTH_SHORT).show();
                    }
                }, 50);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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



    private void weatherUpdate(final City city){

        if(city.getName().equals("Select")){
            return;
        }

        currentLocation = new LatLng(Double.parseDouble(city.getLattitude()), Double.parseDouble(city.getLongitude()));


        Intent currentIntent = new Intent(MainActivity.this, CurrentConditionsView.class);
        currentIntent.putExtra("lattitude",city.getLattitude());
        currentIntent.putExtra("longitude",city.getLongitude());
        startActivity(currentIntent);



    }
}
