package OOP.LabTask4.First;


public class applience {
    protected String name;
    protected String brand;
    applience(String name,String brand){
        this.name=name;
        this.brand=brand;
    }
    
    
    public void display(){
        System.out.println("name is "+name); 
        System.out.println("Brand is "+brand); 
    }

}
