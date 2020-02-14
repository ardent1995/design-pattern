package builderpattern.demo;

public class Director {
    private IBuilder myBuilder;

    public void construct(IBuilder builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.addWheels();
        myBuilder.addheadlights();
    }
}
