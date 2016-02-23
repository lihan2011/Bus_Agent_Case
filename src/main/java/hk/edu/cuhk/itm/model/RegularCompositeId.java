package hk.edu.cuhk.itm.model;

import java.io.Serializable;

public class RegularCompositeId implements Serializable {

    private String tourCode;
    private int busId;

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }
}
