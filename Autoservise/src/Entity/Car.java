package Entity;

import java.util.List;

public class Car extends EntityHasId {

    private String Model;
    private int Year;
    private String Mark;

    private List<Detail> carDetails;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public List<Detail> getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(List<Detail> carDetails) {
        this.carDetails = carDetails;
    }
}

