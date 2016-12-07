package com.example.josh.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Josh on 2016-11-19.
 */

public class ForecastDaily {

    @SerializedName("class")
    private String _class = null;
    @SerializedName("expire_time_gmt")
    private Double expireTimeGmt = 1.3739148E9;
    @SerializedName("fcst_valid")
    private Double fcstValid = 1.3693068E9;
    @SerializedName("fcst_valid_local")
    private Date fcstValidLocal = null;
    @SerializedName("num")
    private Integer num = 1;
    @SerializedName("max_temp")
    private Integer maxTemp = 82;
    @SerializedName("min_temp")
    private Integer minTemp = 59;
    @SerializedName("blurb")
    private String blurb = null;
    @SerializedName("blurb_author")
    private String blurbAuthor = null;
    @SerializedName("dow")
    private String dow = null;
    @SerializedName("lunar_phase_code")
    private String lunarPhaseCode = null;
    @SerializedName("lunar_phase")
    private String lunarPhase = null;
    @SerializedName("lunar_phase_day")
    private Integer lunarPhaseDay = 17;
    @SerializedName("qualifier_code")
    private String qualifierCode = null;
    @SerializedName("qualifier")
    private String qualifier = null;
    @SerializedName("narrative")
    private String narrative = null;
    @SerializedName("qpf")
    private Float qpf = 0.06f;
    @SerializedName("torcon")
    private Integer torcon = 0;
    @SerializedName("stormcon")
    private Integer stormcon = 0;
    @SerializedName("snow_qpf")
    private Float snowQpf = 1.3f;
    @SerializedName("snow_range")
    private String snowRange = null;
    @SerializedName("snow_phrase")
    private String snowPhrase = null;
    @SerializedName("snow_code")
    private String snowCode = null;
    @SerializedName("day")
    private Daily day = null;
    @SerializedName("night")
    private Daily night = null;


    /**
     * The data identifier.<br>  ● Example: fod_long_range_daily<br>  ● Do not display
     **/
    public String get_Class() {

        return _class;
    }

    public void set_Class(String _class) {

        this._class = _class;
    }

    /**
     * The expiration time in UNIX seconds.<br>  ● Example: 1373914800<br>  ● Do not display
     **/
    public Double getExpireTimeGmt() {

        return expireTimeGmt;
    }

    public void setExpireTimeGmt(Double expireTimeGmt) {

        this.expireTimeGmt = expireTimeGmt;
    }

    /**
     * The valid time forecast in UNIX seconds.<br>  ● Example: 1369306800<br>  ● Do not display
     **/
    public Double getFcstValid() {

        return fcstValid;
    }

    public void setFcstValid(Double fcstValid) {

        this.fcstValid = fcstValid;
    }

    /**
     * The valid time forecast in local apparent time.<br>  ● Example: 20130806T07:00:00 0400<br>  ● Do not display
     **/
    public Date getFcstValidLocal() {

        return fcstValidLocal;
    }

    public void setFcstValidLocal(Date fcstValidLocal) {

        this.fcstValidLocal = fcstValidLocal;
    }

    /**
     * The sequential number that identifies each of the forecasted days in the API. The days start on day 1, which is the forecast for the current day. The forecast for tomorrow uses number 2, then number 3 for the day after tomorrow, and so on.<br>  ● Range: 1 15<br>  ● Example: 1<br>  ● Display as provided
     **/
    public Integer getNum() {

        return num;
    }

    public void setNum(Integer num) {

        this.num = num;
    }

    /**
     * The daily maximum temperature.<br>  ● Example: 82<br>  ● Display as provided in degrees Fahrenheit or degrees Celsius based on the units of measure in the API request. ​Always display the unit of temperature (F or C) with the value.
     **/
    public Integer getMaxTemp() {

        return maxTemp;
    }

    public void setMaxTemp(Integer maxTemp) {

        this.maxTemp = maxTemp;
    }

    /**
     * The daily minimum temperature.<br>  ● Example: 59<br>  ● Display as provided in degrees Fahrenheit or degrees Celsius based on the units of measure in the API request. ​Always display the unit of temperature (F or C) with the value.
     **/
    public Integer getMinTemp() {

        return minTemp;
    }

    public void setMinTemp(Integer minTemp) {

        this.minTemp = minTemp;
    }

    /**
     * A handwritten local or regional text forecast created by a meteorologist to supplement the system generated forecast.<br>  ● Example: The Palomar fire is now about 45% contained. Smoke remains a significant problem in the LA basin.<br>  ● Display as provided
     **/
    public String getBlurb() {

        return blurb;
    }

    public void setBlurb(String blurb) {

        this.blurb = blurb;
    }

    /**
     * The name initials of the meteorologist who authored the forecast blurb.<br>  ● Example: SO<br>  ● Display as provided
     **/
    public String getBlurbAuthor() {

        return blurbAuthor;
    }

    public void setBlurbAuthor(String blurbAuthor) {

        this.blurbAuthor = blurbAuthor;
    }

    /**
     * The day of the week.<br>  ● Example: Thursday<br>  ● Processing: You must display this field in your application. Use the name of the week in its abbreviated form, depending on the amount of space your application can use to show text.<br>  ● Examples​: Monday MON Mon. M Tuesday TUE Tue. Tu  Wednesday WED Wed. W  Thursday THU Thur. Th  Friday  FRI Fri. F  Saturday SAT Sat. Sa  Sunday SUN Sun. Su<br>  ● Display as processed by your system
     **/
    public String getDow() {

        return dow;
    }

    public void setDow(String dow) {

        this.dow = dow;
    }

    /**
     * The three-character short code for lunar phases.<br>  ● Example: WNG<br>  ● Do not display
     **/
    public String getLunarPhaseCode() {

        return lunarPhaseCode;
    }

    public void setLunarPhaseCode(String lunarPhaseCode) {

        this.lunarPhaseCode = lunarPhaseCode;
    }

    /**
     * A descriptive phrase for the current lunar phase.<br>  ● Example: Waning Gibbous<br>  ● Display as provided
     **/
    public String getLunarPhase() {

        return lunarPhase;
    }

    public void setLunarPhase(String lunarPhase) {

        this.lunarPhase = lunarPhase;
    }

    /**
     * The day number in the monthly lunar cycle.<br>  ● Range: 1 through 28<br>  ● Example: 17<br>  ● Display as provided
     **/
    public Integer getLunarPhaseDay() {

        return lunarPhaseDay;
    }

    public void setLunarPhaseDay(Integer lunarPhaseDay) {

        this.lunarPhaseDay = lunarPhaseDay;
    }

    /**
     * A code for special forecasted weather criteria for the 12- and 24-hour day parts.<br>  ● Example: Q9015<br>  ● Do not display
     **/
    public String getQualifierCode() {

        return qualifierCode;
    }

    public void setQualifierCode(String qualifierCode) {

        this.qualifierCode = qualifierCode;
    }

    /**
     * A phrase associated with the qualifier_code that describes special forecasted weather criteria for the 12- and 24-hour day parts.<br>  ● Example: Winds could  occasionally gust over 70 mph<br>  ● Display as provided
     **/
    public String getQualifier() {

        return qualifier;
    }

    public void setQualifier(String qualifier) {

        this.qualifier = qualifier;
    }

    /**
     * The narrative forecast for the 24-hour period.<br>  ● Example: A few thunderstorms possible. Lows overnight in the low 60s.<br>  ● Display as provided
     **/
    public String getNarrative() {

        return narrative;
    }

    public void setNarrative(String narrative) {

        this.narrative = narrative;
    }

    /**
     * The forecasted measurable precipitation (liquid or liquid equivalent) during the 12- or 24-hour forecast period.<br>  ● Example: 0.06<br>  ● Display as provided with the correct units of measure (inches or millimeters)
     **/
    public Float getQpf() {

        return qpf;
    }

    public void setQpf(Float qpf) {

        this.qpf = qpf;
    }

    /**
     * The estimate of the likelihood of tornado activity during a given 24-hour forecast period.<br>  ● Range: 0 to 10<br>  ● Example: 0<br>  ● Display as provided
     **/
    public Integer getTorcon() {

        return torcon;
    }

    public void setTorcon(Integer torcon) {

        this.torcon = torcon;
    }

    /**
     * The estimate of the likelihood of winter storm activity during a given 24-hour forecast period<br>  ● Range: 0 to 10<br>  ● Example: 0<br>  ● Display as provided
     **/
    public Integer getStormcon() {

        return stormcon;
    }

    public void setStormcon(Integer stormcon) {

        this.stormcon = stormcon;
    }


    /**
     * The forecasted measurable precipitation as snow during the 12- or 24-hour forecast period.<br>  ● Example: 1.3<br>  ● Display as provided with the correct units of measure (inches or centimeters)
     **/
    public Float getSnowQpf() {

        return snowQpf;
    }

    public void setSnowQpf(Float snowQpf) {

        this.snowQpf = snowQpf;
    }

    /**
     * The expected amount of residual snow for the 12- or 24-hour forecast period.<br>  ● Example: 6  12<br>  ● Display as provided with the correct units of measure (inches or centimeters)
     **/
    public String getSnowRange() {

        return snowRange;
    }

    public void setSnowRange(String snowRange) {

        this.snowRange = snowRange;
    }

    /**
     * A shortened text description of the forecasted​ ​snow accumulation during the 12- or 24-hour forecast period.<br>  ● Example: Potential for 612 inches of snow<br>  ● Display as provided with the correct units of measure (inches or centimeters)
     **/
    public String getSnowPhrase() {

        return snowPhrase;
    }

    public void setSnowPhrase(String snowPhrase) {

        this.snowPhrase = snowPhrase;
    }

    /**
     * The residual snow accumulation code for the 12- or 24-hour forecast period.<br>  ● Example: A9015<br>  ● Do not display
     **/
    public String getSnowCode() {

        return snowCode;
    }

    public void setSnowCode(String snowCode) {

        this.snowCode = snowCode;
    }

    /**
     **/
    public Daily getDay() {

        return day;
    }

    public void setDay(Daily day) {

        this.day = day;
    }

    /**
     **/
    public Daily getNight() {

        return night;
    }

    public void setNight(Daily night) {

        this.night = night;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForecastDaily {\n");

        sb.append("  _class: ").append(_class).append("\n");
        sb.append("  expireTimeGmt: ").append(expireTimeGmt).append("\n");
        sb.append("  fcstValid: ").append(fcstValid).append("\n");
        sb.append("  fcstValidLocal: ").append(fcstValidLocal).append("\n");
        sb.append("  num: ").append(num).append("\n");
        sb.append("  maxTemp: ").append(maxTemp).append("\n");
        sb.append("  minTemp: ").append(minTemp).append("\n");
        sb.append("  blurb: ").append(blurb).append("\n");
        sb.append("  blurbAuthor: ").append(blurbAuthor).append("\n");
        sb.append("  dow: ").append(dow).append("\n");
        sb.append("  lunarPhaseCode: ").append(lunarPhaseCode).append("\n");
        sb.append("  lunarPhase: ").append(lunarPhase).append("\n");
        sb.append("  lunarPhaseDay: ").append(lunarPhaseDay).append("\n");
        sb.append("  qualifierCode: ").append(qualifierCode).append("\n");
        sb.append("  qualifier: ").append(qualifier).append("\n");
        sb.append("  narrative: ").append(narrative).append("\n");
        sb.append("  qpf: ").append(qpf).append("\n");
        sb.append("  torcon: ").append(torcon).append("\n");
        sb.append("  stormcon: ").append(stormcon).append("\n");
        sb.append("  snowQpf: ").append(snowQpf).append("\n");
        sb.append("  snowRange: ").append(snowRange).append("\n");
        sb.append("  snowPhrase: ").append(snowPhrase).append("\n");
        sb.append("  snowCode: ").append(snowCode).append("\n");
        sb.append("  day: ").append(day).append("\n");
        sb.append("  night: ").append(night).append("\n");
        sb.append("}\n");
        return sb.toString();
    }


}
