
package com.example.josh.weatherapp.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AlertDialog;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.josh.weatherapp.R;
import com.example.josh.weatherapp.model.CurrentCondition;
import com.example.josh.weatherapp.model.Daily;
import com.example.josh.weatherapp.model.DailyForecast;
import com.example.josh.weatherapp.model.ForecastDaily;
import com.example.josh.weatherapp.model.Observation;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ibm.mobilefirstplatform.clientsdk.android.core.api.Request;
import com.ibm.mobilefirstplatform.clientsdk.android.core.api.Response;
import com.ibm.mobilefirstplatform.clientsdk.android.core.api.ResponseListener;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;




public class CurrentConditionsViewMap implements GoogleMap.InfoWindowAdapter {

    private final String basePath = "https://twcservice.mybluemix.net/api/weather";
    private Gson gson;
    private String mUsername;
    private String mPassword;

    private LayoutInflater mInflater;
    private Context mContext;
    private Activity mActivity;

    private CurrentCondition mCurrentCondition;
    private DailyForecast mDailyForecast;
    private LatLng mCoordinate;

    private View mView;

    public CurrentConditionsViewMap(Activity activity, Context context, LatLng coordinate) {

        mContext = context;
        mActivity = activity;
        mInflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        mView = mInflater.inflate(R.layout.current_conditions_map_info, null);
        mCoordinate = coordinate;
        mCurrentCondition = null;
        mDailyForecast = null;
        mUsername = mContext.getResources().getString(R.string.weather_username);
        mPassword = mContext.getResources().getString(R.string.weather_password);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        gson = gsonBuilder.create();

    }
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        if (mCurrentCondition == null && mDailyForecast == null) {
            setCurrentConditions(marker, mCoordinate);
            setThreeDayForecast(marker, mCoordinate);
        }

        return mView;
    }

    private void setThreeDayForecast(final Marker marker, LatLng coordinate) {

        final TextView narrative = (TextView) mView.findViewById(R.id.narrative);
        final TextView today = (TextView) mView.findViewById(R.id.today);

        final ImageView dayOneIcon = (ImageView) mView.findViewById(R.id.icon_one);
        final ImageView dayTwoIcon = (ImageView) mView.findViewById(R.id.icon_two);
        final ImageView dayThreeIcon = (ImageView) mView.findViewById(R.id.icon_three);

        final TextView dayOne = (TextView) mView.findViewById(R.id.day_one);
        final TextView dayTwo = (TextView) mView.findViewById(R.id.day_two);
        final TextView dayThree = (TextView) mView.findViewById(R.id.day_three);
        final TextView dayOneTemp = (TextView) mView.findViewById(R.id.temp_one);
        final TextView dayTwoTemp = (TextView) mView.findViewById(R.id.temp_two);
        final TextView dayThreeTemp = (TextView) mView.findViewById(R.id.temp_three);

        String path = "/v1/geocode/{latitude}/{longitude}/forecast/daily/3day.json"
                .replaceAll("\\{latitude\\}", ((Double) coordinate.latitude).toString())
                .replaceAll("\\{longitude\\}", ((Double) coordinate.longitude).toString());

        String basicAuthString = mUsername + ":" + mPassword;
        byte[] encodedString = Base64.encode(basicAuthString.getBytes(), Base64.NO_WRAP);
        String credentials = "Basic " + new String(encodedString);
        Map<String, List<String>> headers = Collections.singletonMap("Authorization", Collections.singletonList(credentials));
        Map<String, String> queryParameters = Collections.singletonMap("language", "en-US");

        Request request = new Request(this.basePath + path, Request.GET);
        request.setQueryParameters(queryParameters);
        request.setHeaders(headers);
        request.send(mContext, new ResponseListener() {

            @Override
            public void onSuccess(Response response) {
                String text = response.getResponseText();
                mDailyForecast = gson.fromJson(text, DailyForecast.class);
                List<ForecastDaily> forecasts = mDailyForecast.getForecasts();
                Daily daily = (forecasts.get(0).getDay() == null) ? forecasts.get(0).getNight() : forecasts.get(0).getDay();
                narrative.setText(forecasts.get(0).getNarrative());
                today.setText(daily.getDaypartName());
                dayOne.setText(forecasts.get(1).getDow());
                dayTwo.setText(forecasts.get(2).getDow());
                dayThree.setText(forecasts.get(3).getDow());
                dayOneTemp.setText(forecasts.get(1).getMaxTemp() + "\u00B0F" + " | " + forecasts.get(0).getMinTemp() + "\u00B0F");
                dayTwoTemp.setText(forecasts.get(2).getMaxTemp() + "\u00B0F" + " | " + forecasts.get(1).getMinTemp() + "\u00B0F");
                dayThreeTemp.setText(forecasts.get(3).getMaxTemp() + "\u00B0F" + " | " + forecasts.get(2).getMinTemp() + "\u00B0F");

                Drawable drawable = null;
                int id = mContext.getResources().getIdentifier("ic_" + forecasts.get(1).getDay().getIconCode(), "drawable", mContext.getPackageName());

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    drawable = mContext.getDrawable(id);
                } else {
                    drawable = mContext.getResources().getDrawable(id);
                }
                dayOneIcon.setImageDrawable(drawable);

                id = mContext.getResources().getIdentifier("ic_" + forecasts.get(2).getDay().getIconCode(), "drawable", mContext.getPackageName());

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    drawable = mContext.getDrawable(id);
                } else {
                    drawable = mContext.getResources().getDrawable(id);
                }
                dayTwoIcon.setImageDrawable(drawable);

                id = mContext.getResources().getIdentifier("ic_" + forecasts.get(3).getDay().getIconCode(), "drawable", mContext.getPackageName());

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    drawable = mContext.getDrawable(id);
                } else {
                    drawable = mContext.getResources().getDrawable(id);
                }
                dayThreeIcon.setImageDrawable(drawable);

                mActivity.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        marker.showInfoWindow();
                    }
                });
            }

            @Override
            public void onFailure(Response response, Throwable t, JSONObject extendedInfo) {
                if (response.getStatus() == 401) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
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

                    mActivity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            AlertDialog alert = builder.create();
                            alert.show();
                        }
                    });
                } else if (response.getStatus() == 400) {

                }
            }
        });

    }

    private void setCurrentConditions(final Marker marker, final LatLng coordinate) {

        final ImageView currentIcon = (ImageView) mView.findViewById(R.id.icon);
        final TextView locality = (TextView) mView.findViewById(R.id.locality);

        final TextView description = (TextView) mView.findViewById(R.id.description);
        final TextView currentTemp = (TextView) mView.findViewById(R.id.temp);
        final TextView feelsLike = (TextView) mView.findViewById(R.id.feels_like);
        final TextView humidity = (TextView) mView.findViewById(R.id.humidity);
        final TextView wind = (TextView) mView.findViewById(R.id.wind);

        String path = "/v1/geocode/{latitude}/{longitude}/observations.json"
                .replaceAll("\\{latitude\\}", ((Double) coordinate.latitude).toString())
                .replaceAll("\\{longitude\\}", ((Double) coordinate.longitude).toString());

        String basicAuthString = mUsername + ":" + mPassword;
        byte[] encodedString = Base64.encode(basicAuthString.getBytes(), Base64.NO_WRAP);
        String credentials = "Basic " + new String(encodedString);
        Map<String, List<String>> headers = Collections.singletonMap("Authorization", Collections.singletonList(credentials));
        Map<String, String> queryParameters = Collections.singletonMap("language", "en-US");

        Request request = new Request(this.basePath + path, Request.GET);
        request.setQueryParameters(queryParameters);
        request.setHeaders(headers);
        request.send(mContext, new ResponseListener() {

            @Override
            public void onSuccess(Response response) {
                mCurrentCondition = gson.fromJson(response.getResponseText(), CurrentCondition.class);
                Observation observation = mCurrentCondition.getObservation();
                Geocoder geocoder = new Geocoder(mContext, Locale.getDefault());
                List<Address> addresses = null;
                String cityName = "";
                try {
                    addresses = geocoder.getFromLocation(coordinate.latitude, coordinate.longitude, 1);
                    if (!addresses.isEmpty()) {
                        Address address = addresses.get(0);
                        int addressLine = address.getAddressLine(1).equals(address.getCountryName()) ? 0 : 1;
                        cityName = (address.getLocality() == null) ? address.getAddressLine(addressLine).replaceAll("[0-9]", "").trim() : address.getLocality();;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (cityName.length() > 20) {
                    locality.setTextSize(10.0f);
                }
                locality.setText(cityName);
                description.setText(observation.getBluntPhrase());
                currentTemp.setText(observation.getTemp() + "\u00B0F");
                feelsLike.setText(observation.getFeelsLike() + "\u00B0F");
                humidity.setText(observation.getRh() + "%");
                wind.setText(observation.getWspd() + "mph " + observation.getWdirCardinal());

                Drawable drawable = null;
                Integer iconCode = observation.getWxIcon();
                iconCode = (iconCode == null) ? 44 : iconCode;
                int id = mContext.getResources().getIdentifier("ic_" + iconCode, "drawable", mContext.getPackageName());

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    drawable = mContext.getDrawable(id);
                } else {
                    drawable = mContext.getResources().getDrawable(id);
                }
                currentIcon.setImageDrawable(drawable);

                mActivity.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        marker.showInfoWindow();
                    }
                });
            }

            @Override
            public void onFailure(Response response, Throwable t, JSONObject extendedInfo) {
                if (response.getStatus() == 401) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
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

                    mActivity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            AlertDialog alert = builder.create();
                            alert.show();
                        }
                    });
                } else if (response.getStatus() == 400) {

                }
            }
        });
    }
}
