package transport;

import java.util.Objects;

public class Transport {

    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(int year, String country) {

        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = "country";
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {

        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

    }

    public void setModel(String model) {

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

    }

    public void setColor(String color) {

        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }

    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
