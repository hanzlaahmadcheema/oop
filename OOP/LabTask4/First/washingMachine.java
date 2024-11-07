package OOP.LabTask4.First;

public class washingMachine extends applience  {
   String type;
   washingMachine(String name,String brand,String type){
      super(name, brand);
      this.type=type;
   }
   void show(){
      System.out.println("Name is "+name+"Brand is "+brand+"Type of Meachine "+type);
   }
}
