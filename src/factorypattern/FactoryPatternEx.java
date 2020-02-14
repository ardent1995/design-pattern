package factorypattern;

public class FactoryPatternEx {
    public static void main(String[] args) throws Exception {
        IAnimalFactory factory = new ConcreteAnimalFactory();
        //You can use enum for type
        IAnimal dog = factory.getAnimalType("Dog");
        dog.speak();
        IAnimal tiger = factory.getAnimalType("Tiger");
        tiger.speak();
        IAnimal lion = factory.getAnimalType("Lion");
        lion.speak();
    }
}
