import java.util.List;

public class Assignment1 {
   public static void main(String[] args) {
       Person shiva=new Person();
       shiva.setName("Shiva");
       shiva.setVehicles(List.of(new Bike()));

       Person bhavuk=new Person();
       bhavuk.setName("Bhavuk");
       Car c=new Car();
       c.setColor("Red");
       bhavuk.setVehicles(List.of(c));

       Person payal=new Person();
       payal.setName("Payal");
       Car c1=new Car();
       c1.setColor("Red");
       payal.setVehicles(List.of(c1));

       Person tarun=new Person();
       tarun.setName("Tarun");
       Car bmw=new Car();
        bmw.setName("BMW");
       tarun.setVehicles(List.of(bmw));

       Person updesh=new Person();
       Car bmw1=new Car();
       bmw1.setName("BMW");
       updesh.setName("Updesh");
       updesh.setVehicles(List.of(bmw1,new Bike()));
        


   }
    
}
interface Vehicle{
    public void run();
}
class Car implements Vehicle{
    private String name;
    private String model;
    private String color;
    final private int tyres=4;

    Car(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getTyres() {
        return tyres;
    }
    public void run(){
        System.out.println("Runs fast..");
    }
    Car(String name, String model, String color){
        this.name=name;
        this.model=model;
        this.color=color;
    }
    
}
class Bike implements Vehicle{
    private String name;
    private String color;
    private String model;
    final private int tyres=2;

    Bike(){
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTyres() {
        return tyres;
    }
    
    public void run(){
        System.out.println("Runs at medium speed..");
    }
   
    Bike(String name, String model, String color){
        this.name=name;
        this.model=model;
        this.color=color;
    }

}
class Person{
    String name;
    String age;
    List<Vehicle> vehicles;//has a relationship

    Person(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, String age, List<Vehicle> vehicles) {
        this.name = name;
        this.age = age;
        this.vehicles = vehicles;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
   

}