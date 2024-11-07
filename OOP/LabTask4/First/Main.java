package OOP.LabTask4.First;

class Main extends applience {
    double capacity;
    Main(String name,String brand,double capacity){
        super(name, brand);
        this.capacity= capacity;
    }
    void show(){
        System.out.println("Appliecnce name "+name+"Brand "+brand+"ton "+capacity);
    }
}
