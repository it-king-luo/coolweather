package coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String province;
    private int proviceName;
    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProviceName() {
        return proviceName;
    }

    public void setProviceName(int proviceName) {
        this.proviceName = proviceName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}
