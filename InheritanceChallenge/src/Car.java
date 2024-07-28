public class Car extends Vehicle{
    private String model;
    private int seats;

    public Car(String name, int tires, String color, int doors, String model, int seats) {
        super(name, tires, color, doors);
        this.model = model;
        this.seats = seats;
    }
    public void drive(int speed){
        System.out.println("Car.drive() called.");
        System.out.println("Car is moving at " + speed + ".");
    }
    @Override
    public void move(int speed) {
        drive(5);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
