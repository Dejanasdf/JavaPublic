public class Vehicle {
    private String name;
    private int tires;
    private String color;
    private int doors;

    public Vehicle(String name, int tires, String color, int doors) {
        this.name = name;
        this.tires = tires;
        this.color = color;
        this.doors = doors;
    }
    public void move(int speed){
        System.out.println("Vehicle.move() called.");
        System.out.println("Vehicle is moving at speed of " + speed + "km/h");
    }
    public void changeGear(int gear){

    }
    public void vheicleSteering(String steering){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
