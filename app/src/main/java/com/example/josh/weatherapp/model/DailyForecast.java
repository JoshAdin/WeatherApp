package com.example.josh.weatherapp.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Josh on 2016-11-19.
 */

public class DailyForecast {

    @SerializedName("metadata")
    private Metadata metadata = null;
    @SerializedName("forecasts")

    private List<ForecastDaily> forecasts = null;


    public Metadata getMetadata(){

        return metadata;
    }


    public void setMetadata(Metadata metadata) {

        this.metadata = metadata;
    }

    /**
     **/
    public List<ForecastDaily> getForecasts() {

        return forecasts;
    }

    public void setForecasts(List<ForecastDaily> forecasts) {

        this.forecasts = forecasts;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyForecast {\n");

        sb.append("  metadata: ").append(metadata).append("\n");
        sb.append("  forecasts: ").append(forecasts).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
