package factorypattern;

public interface IAnimalFactory {
    IAnimal getAnimalType(String type) throws Exception;
}
