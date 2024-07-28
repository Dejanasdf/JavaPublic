public class Main {
    public static void main(String[] args) {
    Vehicle vh = new Vehicle("Rus", 4,"Crvena", 3);
        System.out.println(vh.getName());
        System.out.println(vh.getTires());
        System.out.println(vh.getColor());
        System.out.println(vh.getDoors());
        vh.move(5);
        System.out.println("---------------------------------------------------------------------------------------");
    Car golf = new Car("Golf",4,"Crna", 5,"cetvorka", 5);
        System.out.println("Ime vozila je " + golf.getName());
        System.out.println("Broj guma je: " + golf.getTires());
        System.out.println("Boja vozila je: " + golf.getColor());
        System.out.println("Broj vrata je: " + golf.getDoors());
        System.out.println("Model auta je: " + golf.getModel());
        System.out.println("Broj sedista je: " + golf.getSeats());
        golf.move(5);
        System.out.println("---------------------------------------------------------------------------------------");
    CarType mojAuto = new CarType("1.9 TDI", "Crna", "cetvorka", 5,"TDI", 4007760);
        mojAuto.steeringAutomatic("Automatic");

    }
}