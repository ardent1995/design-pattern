package builderpattern.demo;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("\nProduct completed as below :");
        for(String part: parts){
            System.out.println(part);
        }
    }
}
