package transport;

public class Bus extends Transport{

    public Bus(int year, String country, String brand, String model, String color) {

        super(year, country);
        setBrand(brand);
        setModel(model);
        setColor(color);

    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString();
    }

}
