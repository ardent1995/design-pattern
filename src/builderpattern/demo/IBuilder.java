package builderpattern.demo;

public interface IBuilder {
    void buildBody();
    void addWheels();
    void addheadlights();
    Product getVehicle();
}
