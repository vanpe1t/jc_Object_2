package transport;

import java.util.Calendar;
import java.util.Objects;
import java.util.Date;


public class Car extends Transport{

    private double engineVolume;

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

    public Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats, String color) {

        super(year, country);

        setBrand(brand);
        setModel(model);
        setColor(color);

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

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    @Override
    public String toString() {
        return "Автомобиль " +
                "марки: '" + getBrand() + '\'' +
                ", модель: '" + getModel() + '\'' +
                ", с объёмом двигателя: " + engineVolume +
                ", цвет: '" + getColor() + '\'' +
                ", год: " + getYear() +
                ", страна производитель: '" + getCountry() + '\'' +
                ", тип шин: '" +  (typeTires ? "зимняя" : "летняя") + '\'' +
                ", ключ: '" +  key  + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && getYear() == car.getYear() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel())
                && Objects.equals(getColor(), car.getColor()) && Objects.equals(getCountry(), car.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), engineVolume, getColor(), getYear(), getCountry());
    }

    public double getEngineVolume() {
        return engineVolume;
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
