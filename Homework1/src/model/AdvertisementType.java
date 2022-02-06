package model;

public class AdvertisementType {

    //İlan tipi : Kiralık - Satılık - Günlük kiralık
    private String type;

    public AdvertisementType() {
    }

    public AdvertisementType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
