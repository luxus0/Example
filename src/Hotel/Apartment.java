package Hotel;

public class Apartment {

    private String city;
    private float area;
    private float pricePerMeter;

    public Apartment(String city, float area, float pricePerMeter) {
        this.city = city;
        this.area = area;
        this.pricePerMeter = pricePerMeter;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(float pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public float getFullPrice()
    {
        return 0.95f*area*pricePerMeter;
    }
}
