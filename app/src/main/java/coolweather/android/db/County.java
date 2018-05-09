package coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private int cityId;
    private String countyName;
    private String weatherId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountName(String countName) {
        this.countyName = countName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;

    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }





}
