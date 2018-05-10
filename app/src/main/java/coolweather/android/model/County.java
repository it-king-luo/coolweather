package coolweather.android.model;




public class County{
    private int id;
    private int cityId;
    private String countyName;
    private String countyCode;

    public String getCountyName() {
        return countyName;
    }

    public void setCountName(String countName) {
        this.countyName = countName;
    }

    public int getId() {
        return id;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }



    public int getCityId() {
        return cityId;

    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }







}
