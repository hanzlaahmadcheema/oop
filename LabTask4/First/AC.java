package LabTask4.First;

class AC extends applience {
    double capacity;
    AC(String name,String brand,double capacity){
        super(name, brand);
        this.capacity= capacity;
    }
    void show(){
        System.out.println("Appliecnce name "+name+"Brand "+brand+"ton "+capacity);
    }
}
