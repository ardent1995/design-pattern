package factorypattern;

public class ConcreteAnimalFactory implements IAnimalFactory {
    @Override
    public IAnimal getAnimalType(String type) throws Exception {
        switch (type){
            case "Dog":
                return new Dog();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type : "+type+" cannot be instantiated");
        }
    }
}
