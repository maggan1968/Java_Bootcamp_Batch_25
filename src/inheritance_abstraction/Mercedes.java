package inheritance_abstraction;

public class Mercedes extends Car{

    public Mercedes(int year, String model, String color, double price) {
        super(year, "Mercedes", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Start the engine with the start stop button");
    }
}
