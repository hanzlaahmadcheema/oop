package OOP.LabTask8;

import java.util.ArrayList;
class Search {
    private ArrayList<Animal> animals; 

    public Search() {
        animals = new ArrayList<>();
    }

    public void addAnimal(String name, String type) {
        animals.add(new Animal(name, type));
        System.out.println(name + " added to the system.");
    }

    public void searchByType(String type) {
        System.out.println("Searching for " + type + " animals:");
        animals.stream()
               .filter(animal -> animal.type.equalsIgnoreCase(type))
               .forEach(Animal::displayInfo);
    }
}