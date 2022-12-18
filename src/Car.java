import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = "brand";
        }

        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = "country";
        }

        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

    }

    @Override
    public String toString() {
        return "Автомобиль " +
                "марки: '" + brand + '\'' +
                ", модель: '" + model + '\'' +
                ", с объёмом двигателя: " + engineVolume +
                ", цвет: '" + color + '\'' +
                ", год: " + year +
                ", страна производитель: '" + country + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
