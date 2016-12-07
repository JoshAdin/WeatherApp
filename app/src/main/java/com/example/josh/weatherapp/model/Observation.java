package com.example.josh.weatherapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Josh on 2016-11-19.
 */

public class Observation {


    @SerializedName("key")
    private String key = null;
    @SerializedName("class")
    private String _class = null;
    @SerializedName("expire_time_gmt")
    private Double expireTimeGmt = 1.3739148E9;
    @SerializedName("obs_id")
    private String obsId = null;
    @SerializedName("obs_name")
    private String obsName = null;
    @SerializedName("valid_time_gmt")
    private Double validTimeGmt = 1.504300026E9;
    @SerializedName("wx_icon")
    private Integer wxIcon = 47;
    @SerializedName("icon_extd")
    private Integer iconExtd = 5500;
    @SerializedName("temp")
    private Integer temp = 62;
    @SerializedName("wx_phrase")
    private String wxPhrase = null;
    @SerializedName("pressure_desc")
    private String pressureDesc = null;
    @SerializedName("pressure_tend")
    private Integer pressureTend = 0;
    @SerializedName("wdir_cardinal")
    private String wdirCardinal = null;
    @SerializedName("day_ind")
    private String dayInd = null;
    @SerializedName("max_temp")
    private Integer maxTemp = 81;
    @SerializedName("min_temp")
    private Integer minTemp = 48;
    @SerializedName("dewpt")
    private Integer dewpt = 60;
    @SerializedName("rh")
    private Integer rh = 91;
    @SerializedName("feels_like")
    private Integer feelsLike = 60;
    @SerializedName("heat_index")
    private Integer heatIndex = 70;
    @SerializedName("wc")
    private Integer wc = -25;
    @SerializedName("qualifier")
    private String qualifier = null;
    @SerializedName("qualifier_svrty")
    private String qualifierSvrty = null;
    @SerializedName("blunt_phrase")
    private String bluntPhrase = null;
    @SerializedName("terse_phrase")
    private String tersePhrase = null;
    @SerializedName("pressure")
    private Double pressure = 30.06;
    @SerializedName("clds")
    private String clds = null;
    @SerializedName("vis")
    private Double vis = null;
    @SerializedName("wspd")
    private Integer wspd = 15;
    @SerializedName("gust")
    private Integer gust = 35;
    @SerializedName("wdir")
    private Integer wdir = 45;
    @SerializedName("precip_total")
    private Float precipTotal = 0.3f;
    @SerializedName("precip_hrly")
    private Float precipHrly = 0.5f;
    @SerializedName("snow_hrly")
    private Float snowHrly = 1.0f;
    @SerializedName("uv_index")
    private Integer uvIndex = null;
    @SerializedName("uv_desc")
    private String uvDesc = null;

    /**
     * Primary data field to group or access data for.<br>  ● Range: Same as observation station ID<br>  ● Example: KATL<br>  ● Do not display
     **/
    public String getKey() {

        return key;
    }

    public void setKey(String key) {

        this.key = key;
    }

    /**
     * The data identifier.<br>  ● Example: observation<br>  ● Do not display
     **/
    public String get_Class() {

        return _class;
    }

    public void set_Class(String _class) {

        this._class = _class;
    }

    /**
     * The absolute expiration time that is used to implement a common, system-wide method of data and cache expiration.<br>  ● Example: 1373914800<br>  ● Do not display
     **/
    public Double getExpireTimeGmt() {

        return expireTimeGmt;
    }

    public void setExpireTimeGmt(Double expireTimeGmt) {

        this.expireTimeGmt = expireTimeGmt;
    }

    /**
     * The ID of the observation station.<br>  ● Example: KATL<br>  ● Do not display
     **/
    public String getObsId() {

        return obsId;
    }

    public void setObsId(String obsId) {

        this.obsId = obsId;
    }

    /**
     * The name of the observation station.<br>  ● Example: Hartsfield-Jackson Airport<br>  ● Display as provided
     **/
    public String getObsName() {

        return obsName;
    }

    public void setObsName(String obsName) {

        this.obsName = obsName;
    }

    /**
     * The valid time of observation as a Unix epoch value (seconds since start of 1970, UTC).<br>  ● Example: 1504300026<br>  ● Processing: Sort by the observation date/time (oldest to newest, newest to oldest) and convert to the range appropriate for your application<br>  ● Examples:  US Range: MM/DD/YYYY  HH:MM:SS   US Range: MM/DD/YYYY   European Range:  DD/MM/YYYY  Asian Range: YYYY/MM/DD<br>  ● Display as formatted by your application
     **/
    public Double getValidTimeGmt() {

        return validTimeGmt;
    }

    public void setValidTimeGmt(Double validTimeGmt) {

        this.validTimeGmt = validTimeGmt;
    }

    /**
     * The two-digit number to represent the observed weather conditions.
     **/
    public Integer getWxIcon() {

        return wxIcon;
    }

    public void setWxIcon(Integer wxIcon) {

        this.wxIcon = wxIcon;
    }

    /**
     * The four-digit number to represent the observed weather conditions.
     **/
    public Integer getIconExtd() {

        return iconExtd;
    }

    public void setIconExtd(Integer iconExtd) {

        this.iconExtd = iconExtd;
    }

    /**
     * The temperature of the air, measured by a thermometer 1.5 meters (4.5 feet) above the ground that is shaded from the other elements. You will receive this data field in Fahrenheit degrees or Celsius degrees.<br>  ● Range: 140 to 140 (F)<br>  ● Example: 68<br>  ● Display as provided in degrees Fahrenheit or degrees Celsius based on the unit of measure in the API request. Always display the unit of temperature (Â°F or Â°C) with the value.
     **/
    public Integer getTemp() {

        return temp;
    }

    public void setTemp(Integer temp) {

        this.temp = temp;
    }

    /**
     * A text description of the observed weather conditions at the reporting station.
     **/
    public String getWxPhrase() {

        return wxPhrase;
    }

    public void setWxPhrase(String wxPhrase) {

        this.wxPhrase = wxPhrase;
    }

    /**
     * A phrase describing the change in the barometric pressure reading over the last hour.<br>  ● Steady <br>  ● Rising <br>  ● Rapidly Rising <br>  ● Falling <br>  ● Rapidly Falling
     **/
    public String getPressureDesc() {

        return pressureDesc;
    }

    public void setPressureDesc(String pressureDesc) {

        this.pressureDesc = pressureDesc;
    }

    /**
     * The change in the barometric pressure reading over the last hour expressed as an integer.<br>  ● 0 = Steady <br>  ● 1 = Rising or Rapidly Rising <br>  ● 2 = Falling or Rapidly Falling
     **/
    public Integer getPressureTend() {

        return pressureTend;
    }

    public void setPressureTend(Integer pressureTend) {

        this.pressureTend = pressureTend;
    }

    /**
     * The cardinal direction from which the wind blows in an abbreviated form. Wind directions are always expressed as “from whence the wind blows” meaning that a North wind blows from North to South. If you face North in a North wind, the wind is at your face. Face southward and the North wind is at your back.<br>  ● Range: N, NNE, NE, ENE,  E, ESE, SE, SSE,  S, SSW, SW,  WSW, W, WNW,  NW, NNW, CALM<br>  ● Example: ENE
     **/
    public String getWdirCardinal() {

        return wdirCardinal;
    }

    public void setWdirCardinal(String wdirCardinal) {

        this.wdirCardinal = wdirCardinal;
    }

    /**
     * An indicator that indicates whether it is daytime or nighttime based on the local apparent time of the location.<br>  ● Range: D = Day,  N = Night,  X = missing ​(for extreme northern and southern hemisphere)<br>  ● Example: D<br>  ● Do not display
     **/
    public String getDayInd() {

        return dayInd;
    }

    public void setDayInd(String dayInd) {

        this.dayInd = dayInd;
    }

    /**
     * The maximum temperature in the last 24 hours.
     **/
    public Integer getMaxTemp() {

        return maxTemp;
    }

    public void setMaxTemp(Integer maxTemp) {

        this.maxTemp = maxTemp;
    }

    /**
     * The minimum temperature in the last 24 hours.
     **/
    public Integer getMinTemp() {

        return minTemp;
    }

    public void setMinTemp(Integer minTemp) {

        this.minTemp = minTemp;
    }

    /**
     * The temperature that air must be cooled at constant pressure to reach saturation. The dew point is also an indirect measure of the humidity of the air. The dew point will never exceed the temperature. When the dew point and temperature are equal, clouds or fog will typically form. The closer the values of temperature and dew point, the higher the relative humidity.<br>  ● Range: -80 to 100 (F)<br>  ● Example: 60<br>  ● Display as provided in degrees Fahrenheit or degrees Celsius based on the unit of measure in the API request. ​Always display the unit of temperature (°F or °C) with the value.
     **/
    public Integer getDewpt() {

        return dewpt;
    }

    public void setDewpt(Integer dewpt) {

        this.dewpt = dewpt;
    }

    /**
     * The relative humidity of the air, which is defined as the ratio of the amount of water vapor in the air to the amount of vapor required to bring the air to saturation at a constant temperature. Relative humidity is always expressed as a percentage.<br>  ● Range: 0 to 100<br>  ● Example: 55<br>  ● You must display the percent sign % after the value
     **/
    public Integer getRh() {

        return rh;
    }

    public void setRh(Integer rh) {

        this.rh = rh;
    }

    /**
     * An apparent temperature that represents what the air temperature feels like on exposed human skin due to the combined effect of the wind chill or heat inde<br>  ● Example: 60<br>  ● When the temperature is 40°F or lower the feels like value represents the computed wind chill so display the wind chill value. When the temperature is 70°F or higher, the feels like value represents the computed heat index so display the heat index value.
     **/
    public Integer getFeelsLike() {

        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {

        this.feelsLike = feelsLike;
    }

    /**
     * An apparent temperature that represents what the air temperature feels like on exposed human skin due to the combined effect of warm temperatures and high humidity. When the temperature is 70°F or higher, the feels like value represents the computed heat index. For temperatures between 40°F and 70°F, the feels like value and temperature are the same, regardless of wind speed and humidity, so use the temperature value.<br>  ● Example: 98<br>  ● Processing: Display heat index only when the heat index value in your data feed is more than 21°C or 70°F.<br>  ● Use either Celsius degrees or Fahrenheit degrees or both. Always display the unit of temperature (°F or °C) with the value.
     **/
    public Integer getHeatIndex() {

        return heatIndex;
    }

    public void setHeatIndex(Integer heatIndex) {

        this.heatIndex = heatIndex;
    }

    /**
     * An apparent temperature. It represents what the air temperature feels like on exposed human skin due to the combined effect of the cold temperatures and wind speed.  When the temperature is 61°F or lower, the feels like value represents the computed wind chill so display the wind chill value. For temperatures between 61°F and 75°F, the Feels  Like value and temperature are the same, regardless of wind speed and humidity, so display the temperature value.<br>  ● Range: Use only if temperature is below 40 degrees Fahrenheit OR below 5 degrees Celsius<br>  ● Example: -25<br>  ● Processing: Display wind chill only when the wind chill value in your data feed is less than 5°C or 40°F.<br>  ● Always display the unit of temperature (°F or °C) with the value
     **/
    public Integer getWc() {

        return wc;
    }

    public void setWc(Integer wc) {

        this.wc = wc;
    }

    /**
     * Weather description qualifier code<br>  ● Example: QQ0063<br>  ● Do not display
     **/
    public String getQualifier() {

        return qualifier;
    }

    public void setQualifier(String qualifier) {

        this.qualifier = qualifier;
    }

    /**
     * Weather description qualifier severity<br>  ● Range: 1 (low) to 6 (high)<br>  ● Example: 1<br>  ● Display as provided
     **/
    public String getQualifierSvrty() {

        return qualifierSvrty;
    }

    public void setQualifierSvrty(String qualifierSvrty) {

        this.qualifierSvrty = qualifierSvrty;
    }

    /**
     * Weather description qualifier short phrase<br>  ● Example: Warmer than yesterday.<br>  ● Display as provided
     **/
    public String getBluntPhrase() {

        return bluntPhrase;
    }

    public void setBluntPhrase(String bluntPhrase) {

        this.bluntPhrase = bluntPhrase;
    }

    /**
     * Weather description qualifier terse phrase<br>  ● Example: Dangerous wind chills. Limit outdoor exposure.<br>  ● Display as provided
     **/
    public String getTersePhrase() {

        return tersePhrase;
    }

    public void setTersePhrase(String tersePhrase) {

        this.tersePhrase = tersePhrase;
    }

    /**
     * Barometric pressure is the pressure exerted by the atmosphere at the earth's surface, due to the weight of the air. This value is read directly from an instrument called a mercury barometer and its units are expressed in millibars (equivalent to HectoPascals).<br>  ● Example: 30.06<br>  ● Display the value using up to one decimal and always use the unit of measure millibars or its abbreviation 'mb.' The Barometric Pressure should be labeled using one of the following: Pressure, Atmospheric Pressure, Surface Pressure, or Barometric Pressure
     **/
    public Double getPressure() {

        return pressure;
    }

    public void setPressure(Double pressure) {

        this.pressure = pressure;
    }

    /**
     * Cloud cover description code<br>  ● Range: SKC, CLR, SCT, FEW, BKN, OVC<br>  ● Example: SKC<br>  ● Display as provided
     **/
    public String getClds() {

        return clds;
    }

    public void setClds(String clds) {

        this.clds = clds;
    }

    /**
     * The horizontal visibility at the observation point. Visibilities can be reported as fractional values particularly when visibility is less than 2 miles. Visibilities greater than 10 statute miles(16.1 kilometers) that are considered unlimited are reported as 999 in your feed. You can also find visibility values that equal zero. This occurrence is not wrong. Dense fogs and heavy snows can produce values near zero. Fog, smoke, heavy rain and other weather phenomena can reduce visibility to near zero miles or kilometers.<br>  ● Range: 0 to 999 or null For greater than 1 = no decimal. For less than 1 = 2 (Metric) & 2 (Imperial) decimal places.<br>  ● Example: 10, 0.25 (Metric)  0.25 (Imperial)<br>  ● Processing: Whenever the value is 999, your application should display the visibility field as unlimited.<br>  ● Display as provided
     **/
    public Double getVis() {

        return vis;
    }

    public void setVis(Double vis) {

        this.vis = vis;
    }

    /**
     * Wind speed. The wind is treated as a vector, therefore, winds must have direction and magnitude (speed). The wind information reported in the hourly current conditions corresponds to a 10-minute average called the sustained wind speed. Sudden or brief variations in the wind speed are known as wind gusts and are reported in a separate data field. Wind directions are always expressed as 'from whence the wind blows'. For example, a North wind blows from North to South. If you face North in a North wind the wind is at your face. Face southward and the North wind is at your back.<br>  ● Example: 15<br>  ● Display the wind speed with its wind direction. Use the value as it appears in the data feed (numeric value) and always display its unit of measure, either the fully spelled version or its abbreviation. Examples Wind: from the Southeast at 8 miles per hour. Wind: from the Northwest at 12 kilometers/hour.
     **/
    public Integer getWspd() {

        return wspd;
    }

    public void setWspd(Integer wspd) {

        this.wspd = wspd;
    }

    /**
     * Wind gust speed. This data field contains information about sudden and temporary variations of the average wind speed. The report always shows the maximum wind gust speed recorded during the observation period. If wind speed is shown, this field must be displayed. The speed of the gust can be expressed in miles per hour or kilometers per hour.<br>  ● Example: 35<br>  ● Display the wind speed with its wind direction. Use the value as it appears in the data feed (numeric value) and always display its unit of measure, either the fully spelled version or its abbreviation.<br>  ● Examples Wind: from the East at 10 miles per hour, gusting to 25 miles per hour. Wind: from the West at 17 kilometers per hour, gusting to 25 kilometers per hour.
     **/
    public Integer getGust() {

        return gust;
    }

    public void setGust(Integer gust) {

        this.gust = gust;
    }

    /**
     * The direction from which the wind blows expressed in degrees. The magnetic direction varies from 0 to 359 degrees, where 0Â° indicates the North, 90Â° the East, 180Â° the South, 270Â° the West, and so forth.<br>  ● Range: 0 to 359<br>  ● Example: 45<br>  ● Processing: No processing needed unless you wish to expand the data feed value into a full phrase (recommended). We recommend you use the cardinal wind direction unless your audience (usually pilots, military, sailing enthusiasts) are familiar with and understand magnetic wind direction.<br>  ● Wind direction should always be displayed along with the wind speed, including wind gusts if present. Use either magnetic wind direction â€‹or cardinal wind direction, but not both. We recommend that you use the full spelling of the wind direction value contained in the feed (North, South, Southeast, and so on).
     **/
    public Integer getWdir() {

        return wdir;
    }

    public void setWdir(Integer wdir) {

        this.wdir = wdir;
    }

    /**
     * Precipitation amount in the last 24 hours<br>  ● Range: 0.00 to 99.99<br>  ● Example: 0.3<br>  ● Display as provided with correct unit of measure (inches or centimeters or millimeters)
     **/
    public Float getPrecipTotal() {

        return precipTotal;
    }

    public void setPrecipTotal(Float precipTotal) {

        this.precipTotal = precipTotal;
    }

    /**
     * Precipitation for the last hour<br>  ● Range: 0.00 to 99.99<br>  ● Example: 0.5<br>  ● Display as provided with the correct unit of measure (inches or centimeters)
     **/
    public Float getPrecipHrly() {

        return precipHrly;
    }

    public void setPrecipHrly(Float precipHrly) {

        this.precipHrly = precipHrly;
    }

    /**
     * Snow increasing rapidly in inches or centimeters per hour depending on whether or not the snowfall is reported by METAR or TECCI (synthetic observations). METAR snow accumulation for the last hour is in inches and TECCI is in centimeters.<br>  ● Range: 0 to 15<br>  ● Example: 1.0<br>  ● Display as provided with the correct unit of measure (inches or centimeters)
     **/
    public Float getSnowHrly() {

        return snowHrly;
    }

    public void setSnowHrly(Float snowHrly) {

        this.snowHrly = snowHrly;
    }

    /**
     * Ultraviolet index<br>  ● Example: 0 to 11 and 999<br>  ● Processing: No processing needed unless the data value is greater than or equal to 11, then you must convert the value to \"10+\".
     **/
    public Integer getUvIndex() {

        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {

        this.uvIndex = uvIndex;
    }

    /**
     * Ultraviolet index description<br>  ● Range: Extreme, High, Low,  Minimal, Moderate, No  Report, Not Available<br>  ● Example: High<br>  ● Display as provided
     **/
    public String getUvDesc() {

        return uvDesc;
    }

    public void setUvDesc(String uvDesc) {

        this.uvDesc = uvDesc;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
        sb.append("class Observation {\n");

        sb.append("  key: ").append(key).append("\n");
        sb.append("  _class: ").append(_class).append("\n");
        sb.append("  expireTimeGmt: ").append(expireTimeGmt).append("\n");
        sb.append("  obsId: ").append(obsId).append("\n");
        sb.append("  obsName: ").append(obsName).append("\n");
        sb.append("  validTimeGmt: ").append(validTimeGmt).append("\n");
        sb.append("  wxIcon: ").append(wxIcon).append("\n");
        sb.append("  iconExtd: ").append(iconExtd).append("\n");
        sb.append("  temp: ").append(temp).append("\n");
        sb.append("  wxPhrase: ").append(wxPhrase).append("\n");
        sb.append("  pressureDesc: ").append(pressureDesc).append("\n");
        sb.append("  pressureTend: ").append(pressureTend).append("\n");
        sb.append("  wdirCardinal: ").append(wdirCardinal).append("\n");
        sb.append("  dayInd: ").append(dayInd).append("\n");
        sb.append("  maxTemp: ").append(maxTemp).append("\n");
        sb.append("  minTemp: ").append(minTemp).append("\n");
        sb.append("  dewpt: ").append(dewpt).append("\n");
        sb.append("  rh: ").append(rh).append("\n");
        sb.append("  feelsLike: ").append(feelsLike).append("\n");
        sb.append("  heatIndex: ").append(heatIndex).append("\n");
        sb.append("  wc: ").append(wc).append("\n");
        sb.append("  qualifier: ").append(qualifier).append("\n");
        sb.append("  qualifierSvrty: ").append(qualifierSvrty).append("\n");
        sb.append("  bluntPhrase: ").append(bluntPhrase).append("\n");
        sb.append("  tersePhrase: ").append(tersePhrase).append("\n");
        sb.append("  pressure: ").append(pressure).append("\n");
        sb.append("  clds: ").append(clds).append("\n");
        sb.append("  vis: ").append(vis).append("\n");
        sb.append("  wspd: ").append(wspd).append("\n");
        sb.append("  gust: ").append(gust).append("\n");
        sb.append("  wdir: ").append(wdir).append("\n");
        sb.append("  precipTotal: ").append(precipTotal).append("\n");
        sb.append("  precipHrly: ").append(precipHrly).append("\n");
        sb.append("  snowHrly: ").append(snowHrly).append("\n");
        sb.append("  uvIndex: ").append(uvIndex).append("\n");
        sb.append("  uvDesc: ").append(uvDesc).append("\n");
        sb.append("}\n");
        return sb.toString();
    }


}
