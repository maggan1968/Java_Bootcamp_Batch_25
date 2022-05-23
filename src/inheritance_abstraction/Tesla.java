package inheritance_abstraction;

public class Tesla extends Car{

    public Tesla(int year, String make, String model, String color, double price) {
        super(year,"Tesla", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Start the engine with the voice command");

    }
}
