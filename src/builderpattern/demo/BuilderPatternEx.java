package builderpattern.demo;

public class BuilderPatternEx {
    public static void main(String[] args) {
        Director director = new Director();
        IBuilder carBuilder = new Car();
        IBuilder motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        director.construct(motorcycleBuilder);
        Product motorcycle = motorcycleBuilder.getVehicle();
        motorcycle.show();
    }
}
