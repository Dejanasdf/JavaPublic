public class CarType extends Car{
    private String type;
    private int materialNumber;

    public CarType(String name, String color, String model, int seats, String type, int materialNumber) {
        super(name, 4, color, 5, model, seats);
        this.type = type;
        this.materialNumber = materialNumber;
    }
    public void steeringAutomatic(String steering){
        System.out.println("CarType.steeringAutomatic() called");
        System.out.println("Steering is " + steering + ".");
    }

    @Override
    public void vheicleSteering(String steering) {
        steeringAutomatic(steering);
        super.vheicleSteering(steering);
    }
}
