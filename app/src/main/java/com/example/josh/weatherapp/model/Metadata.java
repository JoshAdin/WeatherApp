package com.example.josh.weatherapp.model;

/**
 * Created by Josh on 2016-11-19.
 */
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("version")
    private String version = null;
    @SerializedName("transaction_id")
    private String transactionId = null;
    @SerializedName("expire_time_gmt")
    private Double expireTimeGmt = 1.3739148E9;
    @SerializedName("location_id")
    private String locationId = null;
    @SerializedName("countrycode")
    private String countrycode = null;
    @SerializedName("latitude")
    private Float latitude = 42.303f;
    @SerializedName("longitude")
    private Float longitude = -83.029f;
    @SerializedName("language")
    private String language = null;
    @SerializedName("units")
    private String units = null;


    /**
     * The version number of the API. For example, v1.
     **/
    public String getVersion() {

        return version;
    }

    public void setVersion(String version) {

        this.version = version;
    }

    /**
     * Transaction ID for this call of the API. The format varies for APIs and technology stacks. For example, 1407766348658:1285362530.
     **/
    public String getTransactionId() {

        return transactionId;
    }

    public void setTransactionId(String transactionId) {

        this.transactionId = transactionId;
    }

    /**
     * The data expiration time in UNIX seconds. The value in this data element should be used to expire and remove a record from your system. For example, 1380170732.
     **/
    public Double getExpireTimeGmt() {

        return expireTimeGmt;
    }

    public void setExpireTimeGmt(Double expireTimeGmt) {

        this.expireTimeGmt = expireTimeGmt;
    }

    /**
     * An echo parameter that displays the requested postal code for a location's forecast. This field is populated only when the API is called for postal code location.<br> ● Range: Any valid postal code values<br> ● Example: 30339
     **/
    public String getLocationId() {

        return locationId;
    }

    public void setLocationId(String locationId) {

        this.locationId = locationId;
    }

    /**
     * An echo parameter that displays the requested country code for a location's forecast. This field is populated only when the API is called for postal code location.<br> ● Range: Any valid country code values<br> ● Example: US
     **/
    public String getCountrycode() {

        return countrycode;
    }

    public void setCountrycode(String countrycode) {

        this.countrycode = countrycode;
    }

    /**
     * An echo parameter that displays the requested latitude for a location's forecast. This field is populated only when the API is called for geocode.<br> ● Range: Any valid latitude values<br> ● Example: 33.40
     **/
    public Float getLatitude() {

        return latitude;
    }

    public void setLatitude(Float latitude) {

        this.latitude = latitude;
    }

    /**
     * An echo parameter that displays the requested latitude for a location’s forecast. This field is populated only when the API is called for geocode.<br>  ● Range: Any valid longitude values<br> ● Example: -83.42
     **/
    public Float getLongitude() {

        return longitude;
    }

    public void setLongitude(Float longitude) {

        this.longitude = longitude;
    }

    /**
     * An echo parameter that displays the default or requested translation language for response text.<br>  ● Range: Any language supported by TWC<br> ● Example: en-US
     **/
    public String getLanguage() {

        return language;
    }

    public void setLanguage(String language) {

        this.language = language;
    }

    /**
     * An echo parameter that displays the default or requested units of measure (UOM) for various numeric values.<br>  ● Range: ‘e’ or ‘m’ or ‘h’ or ‘s’<br> ● Example: e
     **/
    public String getUnits() {

        return units;
    }

    public void setUnits(String units) {

        this.units = units;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");

        sb.append("  version: ").append(version).append("\n");
        sb.append("  transactionId: ").append(transactionId).append("\n");
        sb.append("  expireTimeGmt: ").append(expireTimeGmt).append("\n");
        sb.append("  locationId: ").append(locationId).append("\n");
        sb.append("  countrycode: ").append(countrycode).append("\n");
        sb.append("  latitude: ").append(latitude).append("\n");
        sb.append("  longitude: ").append(longitude).append("\n");
        sb.append("  language: ").append(language).append("\n");
        sb.append("  units: ").append(units).append("\n");
        sb.append("}\n");
        return sb.toString();
    }


}
