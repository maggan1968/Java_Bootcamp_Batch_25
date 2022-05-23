package inheritance_abstraction;

public class BMW extends Car{
    public BMW(int year, String make, String model, String color, double price) {
        super(year,"BMW", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Start the engine with the start stop button");
    }
}
