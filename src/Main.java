import transport.Car;
import transport.Car.Key;

public class Main {
    public static void main(String[] args) {

        //Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats)

        Car ladaGranta = new Car("Lada", "Granta", 2015 , "Россия", "седан", 4);
        Car audiA850LTDIQuattro = new Car("Audi", "A8 50 L TDI quattro", 2017, "Германия", "хэтчбэк", 4);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "хэтчбэк", 8);
        Car kiaSportage4thGen = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "хэтчбэк", 5);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "седан", 4);

        System.out.println(ladaGranta);
        System.out.println(audiA850LTDIQuattro);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4thGen);
        System.out.println(hyundaiAvante);

        Car unknownCar = new Car("", "", 0, "", "", 0);
        System.out.println(unknownCar);

        hyundaiAvante.changeTires();
        Key keyAvante = hyundaiAvante.new Key(true, false);
        hyundaiAvante.setKey(keyAvante);
        System.out.println(hyundaiAvante);

    }
}


