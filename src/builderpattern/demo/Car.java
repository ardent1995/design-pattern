package builderpattern.demo;

public class Car implements IBuilder {
    private Product product = new Product();
    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void addWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addheadlights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
