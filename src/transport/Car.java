package transport;

import java.util.Calendar;
import java.util.Objects;
import java.util.Date;


public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;

    private final String bodyType;

    private String regNumber;

    private final int numberOfSeats;

    private boolean typeTires; // true = winter, false = summer

    private Key key;

    public  class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        @Override
        public String toString() {
            return "Key{" +
                    "с удаленным запуском =" + remoteStart +
                    ", безключевой доступ =" + keylessAccess +
                    '}';
        }

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats) {

        if (bodyType == null || brand.isBlank() || brand.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats == 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = "brand";
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
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
                ", страна производитель: '" + country + '\'' +
                ", тип шин: '" +  (typeTires ? "зимняя" : "летняя") + '\'' +
                ", ключ: '" +  key  + '\'';
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

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getTypeTires() {
        return typeTires;
    }

    public boolean isTypeTires() {
        return typeTires;
    }

    public Key getKey() {
        return key;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void changeTires() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4) && typeTires ) {
            typeTires = true;
        } else if (month >=5 && month <= 10 && !typeTires ) {
            typeTires = false;
        }
    }


}
