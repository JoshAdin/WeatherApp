/*
 *     Copyright 2016 IBM Corp.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package com.example.josh.weatherapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.example.josh.weatherapp.model.CurrentConditionsViewMap;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ibm.mobilefirstplatform.clientsdk.android.core.api.BMSClient;



public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback, OnMapLongClickListener,
        OnMapClickListener, OnMarkerClickListener, OnInfoWindowClickListener {

    private GoogleMap mMap;

    private String username;
    private String password;

    private Marker currentMarker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // Core SDK must be initialized to interact with Bluemix mobile services
        BMSClient.getInstance().initialize(getApplicationContext(), BMSClient.REGION_US_SOUTH);

        this.setTitle("Location");
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMapLongClickListener(this);
        mMap.setOnMapClickListener(this);
        mMap.setOnMarkerClickListener(this);
        mMap.setOnInfoWindowClickListener(this);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);

        LatLng currentLocation = new LatLng(42.303, -83.029);;
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 12.0f));

        username = getResources().getString(R.string.weather_username);
        password = getResources().getString(R.string.weather_password);

        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Failed to connect to the Weather Company Data service due to invalid " +
                    "credentials. Please verify your credentials in the weather_credentials.xml file and " +
                    "rebuild the application. See the README for further assistance.");
            builder.setTitle("Uh Oh!");
            builder.setCancelable(false);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();

        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Get the current weather for any point on the map. Simply long press " +
                    "to drop a marker. Tap anywhere on the map to dismiss the current pin");
            builder.setTitle("Welcome!");
            builder.setCancelable(false);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();

            mMap.setInfoWindowAdapter(new CurrentConditionsViewMap(this, getApplicationContext(), currentLocation));
        }
    }

    @Override
    public void onMapLongClick(LatLng latLng) {

        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return;
        }
        Marker current = currentMarker;
        mMap.setInfoWindowAdapter(new CurrentConditionsViewMap(this, getApplicationContext(), latLng));
        currentMarker = mMap.addMarker(new MarkerOptions().position(latLng));

        if (current != null) {
            current.remove();
        }
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12.0f), new GoogleMap.CancelableCallback() {

            @Override
            public void onFinish() {
                currentMarker.showInfoWindow();
            }

            @Override
            public void onCancel() {

            }
        });
    }

    @Override
    public void onMapClick(LatLng latLng) {

        if (currentMarker != null) {
            currentMarker.remove();
        }
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        mMap.animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
        marker.showInfoWindow();

        return true;
    }

    @Override
    public void onInfoWindowClick(Marker marker) {

        Intent forecastIntent = new Intent(this, ForecastActivity.class);
        forecastIntent.putExtra("latitude", marker.getPosition().latitude);
        forecastIntent.putExtra("longitude", marker.getPosition().longitude);
        startActivity(forecastIntent);
    }
}
