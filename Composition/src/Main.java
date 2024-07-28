public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "DELL", "240", dimensions);
        Monitor monitor = new Monitor("27inc Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("b3-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, monitor, theMotherboard);
        thePC.powerUp();
    }
}