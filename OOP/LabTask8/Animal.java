package OOP.LabTask8;

class Animal {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Animal: " + name + ", Type: " + type);
    }
}
