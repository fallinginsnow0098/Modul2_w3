package bai21.thuchanh._FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal = factoryAnimal.getAnimal("cat");
        System.out.println(animal.makeSound());
        Animal animal1 = factoryAnimal.getAnimal("dog");
        System.out.println(animal1.makeSound());
    }
}
