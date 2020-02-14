package builderpattern.demo;

public class Motorcycle implements IBuilder {
    private Product product = new Product();
    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void addWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addheadlights() {
        product.add("headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
