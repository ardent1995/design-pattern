package factorypattern;

public class Dog implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Dog says Ghew-Ghew");
    }
}
