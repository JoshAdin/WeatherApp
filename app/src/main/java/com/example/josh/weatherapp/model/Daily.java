package com.example.josh.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Josh on 2016-11-19.
 */

public class Daily {

    @SerializedName("class")
    private String _class = null;
    @SerializedName("expire_time_gmt")
    private Double expireTimeGmt = 1.3739148E9;
    @SerializedName("fcst_valid")
    private Double fcstValid = 1.3693068E9;
    @SerializedName("fcst_valid_local")
    private Date fcstValidLocal = null;
    @SerializedName("day_ind")
    private String dayInd = null;
    @SerializedName("thunder_enum")
    private Integer thunderEnum = 3;
    @SerializedName("thunder_enum_phrase")
    private String thunderEnumPhrase = null;
    @SerializedName("daypart_name")
    private String daypartName = null;
    @SerializedName("long_daypart_name")
    private String longDaypartName = null;
    @SerializedName("alt_ daypart_name")
    private String altDaypartName = null;
    @SerializedName("num")
    private Integer num = 1;
    @SerializedName("temp")
    private Integer temp = 81;
    @SerializedName("temp_phrase")
    private String tempPhrase = null;
    @SerializedName("hi")
    private Integer hi = 84;
    @SerializedName("wc")
    private Integer wc = 68;
    @SerializedName("pop")
    private Integer pop = 20;
    @SerializedName("pop_phrase")
    private String popPhrase = null;
    @SerializedName("icon_extd")
    private Integer iconExtd = 2600;
    @SerializedName("icon_code")
    private Integer iconCode = 26;
    @SerializedName("wxman")
    private String wxman = null;
    @SerializedName("phrase_32char")
    private String phrase32char = null;
    @SerializedName("phrase_22char")
    private String phrase22char = null;
    @SerializedName("phrase_12char")
    private String phrase12char = null;
    @SerializedName("subphrase_pt1")
    private String subphrasePt1 = null;
    @SerializedName("subphrase_pt2")
    private String subphrasePt2 = null;
    @SerializedName("subphrase_pt3")
    private String subphrasePt3 = null;
    @SerializedName("precip_type")
    private String precipType = null;
    @SerializedName("rh")
    private Integer rh = 83;
    @SerializedName("wspd")
    private Integer wspd = 7;
    @SerializedName("wdir")
    private Integer wdir = 148;
    @SerializedName("wdir_cardinal")
    private String wdirCardinal = null;
    @SerializedName("wind_phrase")
    private String windPhrase = null;
    @SerializedName("clds")
    private Integer clds = 82;
    @SerializedName("shortcast")
    private String shortcast = null;
    @SerializedName("narrative")
    private String narrative = null;
    @SerializedName("qpf")
    private Float qpf = 0.04f;
    @SerializedName("accumulation_phrase")
    private String accumulationPhrase = null;
    @SerializedName("snow_qpf")
    private Float snowQpf = 5.3f;
    @SerializedName("snow_range")
    private String snowRange = null;
    @SerializedName("snow_phrase")
    private String snowPhrase = null;
    @SerializedName("snow_code")
    private String snowCode = null;
    @SerializedName("vocal_key")
    private String vocalKey = null;
    @SerializedName("qualifier")
    private String qualifier = null;
    @SerializedName("qualifier_code")
    private String qualifierCode = null;
    @SerializedName("uv_index_raw")
    private Float uvIndexRaw = 2.22f;
    @SerializedName("uv_index")
    private Integer uvIndex = 2;
    @SerializedName("uv_desc")
    private String uvDesc = null;
    @SerializedName("uv_warning")
    private Integer uvWarning = 0;
    @SerializedName("golf_index")
    private Integer golfIndex = 8;
    @SerializedName("golf_category")
    private String golfCategory = null;


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
     * The valid time forecast in local apparent time.<br>  ● Processing: Required
     **/
    public Date getFcstValidLocal() {

        return fcstValidLocal;
    }

    public void setFcstValidLocal(Date fcstValidLocal) {

        this.fcstValidLocal = fcstValidLocal;
    }

    /**
     * The day or night indicator.<br>  ● Range: D<br>  ● Do not display
     **/
    public String getDayInd() {

        return dayInd;
    }

    public void setDayInd(String dayInd) {

        this.dayInd = dayInd;
    }

    /**
     * The enumeration of thunderstorm probability within an area for a 12-hour day part.<br>  ● Range: 0 through 5<br>  ● Example: 3<br>  ● Display as provided
     **/
    public Integer getThunderEnum() {

        return thunderEnum;
    }

    public void setThunderEnum(Integer thunderEnum) {

        this.thunderEnum = thunderEnum;
    }

    /**
     * The description of probability thunderstorm activity in an area for 12-hour day part.<br>  ● Example: Severe thunderstorms possible<br>  ● Display as provided
     **/
    public String getThunderEnumPhrase() {

        return thunderEnumPhrase;
    }

    public void setThunderEnumPhrase(String thunderEnumPhrase) {

        this.thunderEnumPhrase = thunderEnumPhrase;
    }

    /**
     * The name of a 12-hour day part not including day names in the first 48 hours.<br>  ● Range: Today, Tonight<br>  ● Example: Today<br>  ● Display as provided
     **/
    public String getDaypartName() {

        return daypartName;
    }

    public void setDaypartName(String daypartName) {

        this.daypartName = daypartName;
    }

    /**
     * The named time frame for the valid weather forecast in an expanded format.  The named time frame can be either for  12-hour periods or 24-hour periods.<br>  ● Range: Monday, Monday  Night, Tuesday,  Tuesday Night,  Wednesday,  Wednesday  Night, Thursday,  Thursday Night,  Friday, Friday  Night, Saturday,  Saturday Night,  Sunday, Sunday  Night<br>  ● Example: Tuesday Night<br>  ● Display as provided
     **/
    public String getLongDaypartName() {

        return longDaypartName;
    }

    public void setLongDaypartName(String longDaypartName) {

        this.longDaypartName = longDaypartName;
    }

    /**
     * A specialized version of the daypart_name field. Certain holidays or historic events may replace the usual daypart_name.<br>  ● Example: Christmas Day<br>  ● Display as provided
     **/
    public String getAltDaypartName() {

        return altDaypartName;
    }

    public void setAltDaypartName(String altDaypartName) {

        this.altDaypartName = altDaypartName;
    }

    /**
     * The sequential number that identifies each of the forecasted days in your feed. The numbers start on day 1, which is the forecast for the current day. Then the forecast for tomorrow uses number 2, then number 3 for the day after tomorrow, and so forth.<br>  ● Example: 1<br>  ● Processing: Day 1 is the first day in the series<br>  ● Do not display
     **/
    public Integer getNum() {

        return num;
    }

    public void setNum(Integer num) {

        this.num = num;
    }

    /**
     * The forecasted temperature for midpoint day (1pm) or midpoint night (1am) for a 12-hour day part.<br>  ● Example: 81<br>  ● Display as provided in degrees Fahrenheit or degrees Celsius based on the units of measure in the API request. ​Always display the unit of temperature (°F or °C) with the value.
     **/
    public Integer getTemp() {

        return temp;
    }

    public void setTemp(Integer temp) {

        this.temp = temp;
    }

    /**
     * The short phrase containing the forecasted high or low temperature for 12-hour forecast period.<br>  ● Example: High 81F<br>  ● Display as provided
     **/
    public String getTempPhrase() {

        return tempPhrase;
    }

    public void setTempPhrase(String tempPhrase) {

        this.tempPhrase = tempPhrase;
    }

    /**
     * The daytime maximum heat index. An apparent temperature that represents what the air temperature feels like on exposed human skin due to the combined effect of warm temperatures and high humidity. When the temperature is 70°F or higher, the feels like value represents the computed heat index. For temperatures between 40°F and 70°F, the feels like value and temperature are the same, regardless of wind speed and humidity, so use the temperature value.<br>  ● Example: 84<br>  ● Processing: Display heat index only when the heat index value in your data feed is more than 21°C or 70°F<br>  ● Use either Celsius degrees or Fahrenheits degrees or both. Always display the unit of temperature (°F or °C) with the value.
     **/
    public Integer getHi() {

        return hi;
    }

    public void setHi(Integer hi) {

        this.hi = hi;
    }

    /**
     * The nighttime minimum wind chill. An apparent temperature that represents what the air temperature feels like on exposed human skin due to the combined effect of the cold temperatures and wind speed. When the temperature is 61°F or lower the feels like value represents the computed wind chill so display the wind chill value. For temperatures between 61°F and 75°F , the feels like value and temperature are the same, regardless of wind speed and humidity, so display the temperature value.<br>  ● Example: 68<br>  ● Processing: Display wind chill only when the wind chill value in your data feed is less than 5°C or 40°F.<br>  ● Use either Celsius degrees or Fahrenheit degrees or both. Always display the unit of temperature (°F or °C) with the value.
     **/
    public Integer getWc() {

        return wc;
    }

    public void setWc(Integer wc) {

        this.wc = wc;
    }

    /**
     * The daytime maximum probability of precipitation.<br>  ● Example: 20<br>  ● Display the percent ​% sign after the value
     **/
    public Integer getPop() {

        return pop;
    }

    public void setPop(Integer pop) {

        this.pop = pop;
    }

    /**
     * The daytime probability of precipitation phrase.<br>  ● Example: Chance of snow 90%<br>  ● Display as provided
     **/
    public String getPopPhrase() {

        return popPhrase;
    }

    public void setPopPhrase(String popPhrase) {

        this.popPhrase = popPhrase;
    }

    /**
     * A code that represents explicit full set sensible weather. Refer to the Forecast Icon Code, Weather Phrases and Images​ document.<br>  ● Example: 2600<br>  ● Do not display
     **/
    public Integer getIconExtd() {

        return iconExtd;
    }

    public void setIconExtd(Integer iconExtd) {

        this.iconExtd = iconExtd;
    }

    /**
     * The key to the weather icon lookup. The data field shows the icon number that is matched to represent the observed weather conditions. Refer to the Forecast Icon Code, Weather Phrases and Images document.<br>  ● Example: 26<br>  ● Do not display
     **/
    public Integer getIconCode() {

        return iconCode;
    }

    public void setIconCode(Integer iconCode) {

        this.iconCode = iconCode;
    }

    /**
     * The code to enable the Weather Man animation for forecast period (TWC use only).<br>  ● Example: wx4400<br>  ● Do not display
     **/
    public String getWxman() {

        return wxman;
    }

    public void setWxman(String wxman) {

        this.wxman = wxman;
    }

    /**
     * The daytime sensible weather phrase.<br>  ● Example: Heavy Rain/Wind<br>  ● Display as provided
     **/
    public String getPhrase32char() {

        return phrase32char;
    }

    public void setPhrase32char(String phrase32char) {

        this.phrase32char = phrase32char;
    }

    /**
     * The daytime sensible weather phrase.<br>  ● Example: Cloudy<br>  ● Display as provided
     **/
    public String getPhrase22char() {

        return phrase22char;
    }

    public void setPhrase22char(String phrase22char) {

        this.phrase22char = phrase22char;
    }

    /**
     * The daytime sensible weather phrase.<br>  ● Example: Windy<br>  ● Display as provided
     **/
    public String getPhrase12char() {

        return phrase12char;
    }

    public void setPhrase12char(String phrase12char) {

        this.phrase12char = phrase12char;
    }

    /**
     * Part 1 of 3-part daytime sensible weather phrase.<br>  ● Example: Cloudy<br>  ● The three parts are to be displayed sequentially in numerical order.<br>  ● Display as provided
     **/
    public String getSubphrasePt1() {

        return subphrasePt1;
    }

    public void setSubphrasePt1(String subphrasePt1) {

        this.subphrasePt1 = subphrasePt1;
    }

    /**
     * Part 2 of 3-part daytime sensible weather phrase.<br>  ● Example: Windy<br>  ● The three parts are to be displayed sequentially in numerical order.<br>  ● Display as provided
     **/
    public String getSubphrasePt2() {

        return subphrasePt2;
    }

    public void setSubphrasePt2(String subphrasePt2) {

        this.subphrasePt2 = subphrasePt2;
    }

    /**
     * Part 3 of 3-part daytime sensible weather phrase.<br>  ● Example: Thunder<br>  ● The three parts are to be displayed sequentially in numerical order.<br>  ● Display as provided
     **/
    public String getSubphrasePt3() {

        return subphrasePt3;
    }

    public void setSubphrasePt3(String subphrasePt3) {

        this.subphrasePt3 = subphrasePt3;
    }

    /**
     * The type of precipitation to display with the probability of precipitation (POP) data element.<br>  ● Range: rain, snow<br>  ● Example: rain<br>  ● Display as provided
     **/
    public String getPrecipType() {

        return precipType;
    }

    public void setPrecipType(String precipType) {

        this.precipType = precipType;
    }

    /**
     * The daytime relative humidity of the air, which is defined as the ratio of the amount of water vapor in the air to the amount of vapor required to bring the air to saturation at a constant temperature. Relative humidity is always expressed as a percentage.<br>  ● Range: 0 to 100<br>  ● Example: 83<br>  ● You must display the percent sign \"%\" after the value
     **/
    public Integer getRh() {

        return rh;
    }

    public void setRh(Integer rh) {

        this.rh = rh;
    }

    /**
     * The maximum forecasted daytime wind speed. The wind is treated as a vector, therefore, winds must have direction and magnitude (speed). The wind information reported in the hourly current conditions corresponds to a 10-minute average called the sustained wind speed. Sudden or brief variations in the wind speed are known as “wind gusts” and are reported in a separate data field. Wind directions are always expressed as \"from whence the wind blows\" meaning that a North wind blows from North to South. If you face North in a North wind the wind is at your face. Face southward and the North wind is at your back.<br>  ● Example: 7<br>  ● Display the wind speed with its wind direction. Use the value as it appears in the data feed (numeric value) and always display its units of measure, either the fully spelled version or its abbreviation.<br>  ● Examples: Wind: from the Southeast at 8 miles per hour. Wind: from the Northwest at 12 kilometers/hour.
     **/
    public Integer getWspd() {

        return wspd;
    }

    public void setWspd(Integer wspd) {

        this.wspd = wspd;
    }

    /**
     * The daytime average wind direction in magnetic notation.<br>  ● Range: 0 to 359<br>  ● Example: 148<br>  ● Display the wind speed with its wind direction. Use the value as it appears in the data feed (numeric value) and always display its units of measure, either the fully spelled version or its abbreviation.<br>  ● Examples: Wind: from the Southeast at 8 miles per hour. Wind: from the Northwest at 12 kilometers/hour.
     **/
    public Integer getWdir() {

        return wdir;
    }

    public void setWdir(Integer wdir) {

        this.wdir = wdir;
    }

    /**
     * The daytime average wind direction in cardinal notation.<br>  ● Range: N , NNE , NE,  ENE, E, ESE,  SE, SSE, S,  SSW, SW, WSW,  W, WNW, NW,  NNW, CALM,  VAR<br>  ● Example: SE<br>  ● Display the wind speed with its wind direction. Use the value as it appears in the data feed (numeric value) and always display its units of measure, either the fully spelled version or its abbreviation.<br>  ● Examples: Wind: from the Southeast at 8 miles per hour. Wind: from the Northwest at 12 kilometers/hour.
     **/
    public String getWdirCardinal() {

        return wdirCardinal;
    }

    public void setWdirCardinal(String wdirCardinal) {

        this.wdirCardinal = wdirCardinal;
    }

    /**
     * The phrase that describes the wind direction and speed for a 12-hour day part.<br>  ● Example: Winds SSE at 5 to 10 mph<br>  ● Processing: None. Units of measure are dependent on the parameter provided in the request.<br>  ● Display as provided
     **/
    public String getWindPhrase() {

        return windPhrase;
    }

    public void setWindPhrase(String windPhrase) {

        this.windPhrase = windPhrase;
    }

    /**
     * The daytime average cloud cover expressed as a percentage.<br>  ● Example: 82<br>  ● You must display the percent sign “%” after the value
     **/
    public Integer getClds() {

        return clds;
    }

    public void setClds(Integer clds) {

        this.clds = clds;
    }

    /**
     * An abbreviated sensible weather portion of narrative forecast.<br>  ● Example: Cloudy<br>  ● Display as provided
     **/
    public String getShortcast() {

        return shortcast;
    }

    public void setShortcast(String shortcast) {

        this.shortcast = shortcast;
    }

    /**
     * The narrative forecast for the daytime period.<br>  ● Example: A few thunderstorms possible. Lows overnight in the low 60s.<br>  ● Display as provided
     **/
    public String getNarrative() {

        return narrative;
    }

    public void setNarrative(String narrative) {

        this.narrative = narrative;
    }

    /**
     * The forecasted measurable precipitation (liquid or liquid equivalent) during the 12-hour forecast period.<br>  ● Example: 0.04<br>  ● Display as provided with the correct units of measure (inches or millimeters)
     **/
    public Float getQpf() {

        return qpf;
    }

    public void setQpf(Float qpf) {

        this.qpf = qpf;
    }

    /**
     * An accumulation phrase of any precipitation type in the 12-hour forecast period.<br>  ● Example: Additional rainfall over 2 inches expected<br>  ● Processing: None. Units of measure are dependent on the parameter provided in the request.<br>  ● Display as provided
     **/
    public String getAccumulationPhrase() {

        return accumulationPhrase;
    }

    public void setAccumulationPhrase(String accumulationPhrase) {

        this.accumulationPhrase = accumulationPhrase;
    }

    /**
     * The forecasted measurable precipitation as snow during the 12-hour forecast period.<br>  ● Example: 5.3<br>  ● Display as provided with the correct units of measure (inches or centimeters)
     **/
    public Float getSnowQpf() {

        return snowQpf;
    }

    public void setSnowQpf(Float snowQpf) {

        this.snowQpf = snowQpf;
    }

    /**
     * Snow accumulation amount for the 12-hour forecast period.<br>  ● Example: 4  6<br>  ● Display as provided with the correct units of measure (inches or centimeters)
     **/
    public String getSnowRange() {

        return snowRange;
    }

    public void setSnowRange(String snowRange) {

        this.snowRange = snowRange;
    }

    /**
     * Snow accumulation phrase for the 12-hour forecast period.<br>  ● Example: Additional snow and ice accumulating 4 to 6 inches<br>  ● Display as provided
     **/
    public String getSnowPhrase() {

        return snowPhrase;
    }

    public void setSnowPhrase(String snowPhrase) {

        this.snowPhrase = snowPhrase;
    }

    /**
     * Residual snow accumulation code for the 12- or 24-hour forecast period.<br>  ● Example: A9015<br>  ● Do not display
     **/
    public String getSnowCode() {

        return snowCode;
    }

    public void setSnowCode(String snowCode) {

        this.snowCode = snowCode;
    }

    /**
     * An encoded narrative forecast used for creating computer-generated audio narratives of the forecast period (TWC use only).<br>  ● Example: D1:DA01:X260026001 1:S260011:TH81:W07 R02<br>  ● Do not display
     **/
    public String getVocalKey() {

        return vocalKey;
    }

    public void setVocalKey(String vocalKey) {

        this.vocalKey = vocalKey;
    }

    /**
     * A forecast qualifier that is applicable to the 12-hour forecast period.<br>  ● Example: Winds could occasionally gust over 70 mph<br>  ● Display as provided
     **/
    public String getQualifier() {

        return qualifier;
    }

    public void setQualifier(String qualifier) {

        this.qualifier = qualifier;
    }

    /**
     * A code for the forecast qualifier applicable to the 12-hour forecast period.<br>  ● Example: Q9015<br>  ● Do not display
     **/
    public String getQualifierCode() {

        return qualifierCode;
    }

    public void setQualifierCode(String qualifierCode) {

        this.qualifierCode = qualifierCode;
    }

    /**
     * The non-truncated UV index which is the intensity of the solar radiation based on a number of factors.<br>  ● Example: 2.22<br>  ● Do not display
     **/
    public Float getUvIndexRaw() {

        return uvIndexRaw;
    }

    public void setUvIndexRaw(Float uvIndexRaw) {

        this.uvIndexRaw = uvIndexRaw;
    }

    /**
     * Maximum UV index for the 12-hour forecast period.<br>  ● Example: 2<br>  ● Display as provided. If the data value is greater than or equal to 11, convert the value to  \"10+\"
     **/
    public Integer getUvIndex() {

        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {

        this.uvIndex = uvIndex;
    }

    /**
     * The UV index description, which complements the UV index value by providing an associated level of risk of skin damage due to exposure.<br>  ● Range: 20<br>  ● Example: 2 is Not Available; 1 is No Report; 0 to 2 is Low; 3 to 5 is Moderate; 6 to 7 is High; 8 to 10 is Very High; 11 to 16 is Extreme<br>  ● Processing: Optional
     **/
    public String getUvDesc() {

        return uvDesc;
    }

    public void setUvDesc(String uvDesc) {

        this.uvDesc = uvDesc;
    }

    /**
     * The UV warning that is based on a UV index of 11 or greater.<br>  ● Example: 0<br>  ● Processing: If the data value is 1, then a UV warning is in effect. If the data value is 0, then no UV warning is in effect.<br>  ● Do not display
     **/
    public Integer getUvWarning() {

        return uvWarning;
    }

    public void setUvWarning(Integer uvWarning) {

        this.uvWarning = uvWarning;
    }

    /**
     * The weather conditions for playing golf expressed on a scale of 0 to 10. Not applicable at night.<br>  ● Example: 8<br>  ● Display as provided
     **/
    public Integer getGolfIndex() {

        return golfIndex;
    }

    public void setGolfIndex(Integer golfIndex) {

        this.golfIndex = golfIndex;
    }

    /**
     * The golf index category expressed as a phrase for the weather conditions for playing golf.<br>  ● Example: Very Good<br>  ● Display as provided
     **/
    public String getGolfCategory() {

        return golfCategory;
    }

    public void setGolfCategory(String golfCategory) {

        this.golfCategory = golfCategory;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
        sb.append("class Daily {\n");

        sb.append("  _class: ").append(_class).append("\n");
        sb.append("  expireTimeGmt: ").append(expireTimeGmt).append("\n");
        sb.append("  fcstValid: ").append(fcstValid).append("\n");
        sb.append("  fcstValidLocal: ").append(fcstValidLocal).append("\n");
        sb.append("  dayInd: ").append(dayInd).append("\n");
        sb.append("  thunderEnum: ").append(thunderEnum).append("\n");
        sb.append("  thunderEnumPhrase: ").append(thunderEnumPhrase).append("\n");
        sb.append("  daypartName: ").append(daypartName).append("\n");
        sb.append("  longDaypartName: ").append(longDaypartName).append("\n");
        sb.append("  altDaypartName: ").append(altDaypartName).append("\n");
        sb.append("  num: ").append(num).append("\n");
        sb.append("  temp: ").append(temp).append("\n");
        sb.append("  tempPhrase: ").append(tempPhrase).append("\n");
        sb.append("  hi: ").append(hi).append("\n");
        sb.append("  wc: ").append(wc).append("\n");
        sb.append("  pop: ").append(pop).append("\n");
        sb.append("  popPhrase: ").append(popPhrase).append("\n");
        sb.append("  iconExtd: ").append(iconExtd).append("\n");
        sb.append("  iconCode: ").append(iconCode).append("\n");
        sb.append("  wxman: ").append(wxman).append("\n");
        sb.append("  phrase32char: ").append(phrase32char).append("\n");
        sb.append("  phrase22char: ").append(phrase22char).append("\n");
        sb.append("  phrase12char: ").append(phrase12char).append("\n");
        sb.append("  subphrasePt1: ").append(subphrasePt1).append("\n");
        sb.append("  subphrasePt2: ").append(subphrasePt2).append("\n");
        sb.append("  subphrasePt3: ").append(subphrasePt3).append("\n");
        sb.append("  precipType: ").append(precipType).append("\n");
        sb.append("  rh: ").append(rh).append("\n");
        sb.append("  wspd: ").append(wspd).append("\n");
        sb.append("  wdir: ").append(wdir).append("\n");
        sb.append("  wdirCardinal: ").append(wdirCardinal).append("\n");
        sb.append("  windPhrase: ").append(windPhrase).append("\n");
        sb.append("  clds: ").append(clds).append("\n");
        sb.append("  shortcast: ").append(shortcast).append("\n");
        sb.append("  narrative: ").append(narrative).append("\n");
        sb.append("  qpf: ").append(qpf).append("\n");
        sb.append("  accumulationPhrase: ").append(accumulationPhrase).append("\n");
        sb.append("  snowQpf: ").append(snowQpf).append("\n");
        sb.append("  snowRange: ").append(snowRange).append("\n");
        sb.append("  snowPhrase: ").append(snowPhrase).append("\n");
        sb.append("  snowCode: ").append(snowCode).append("\n");
        sb.append("  vocalKey: ").append(vocalKey).append("\n");
        sb.append("  qualifier: ").append(qualifier).append("\n");
        sb.append("  qualifierCode: ").append(qualifierCode).append("\n");
        sb.append("  uvIndexRaw: ").append(uvIndexRaw).append("\n");
        sb.append("  uvIndex: ").append(uvIndex).append("\n");
        sb.append("  uvDesc: ").append(uvDesc).append("\n");
        sb.append("  uvWarning: ").append(uvWarning).append("\n");
        sb.append("  golfIndex: ").append(golfIndex).append("\n");
        sb.append("  golfCategory: ").append(golfCategory).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

}
