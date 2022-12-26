import Pattern.LooseCoupling;
import Pattern.TightCoupling;

public class IocMain {
    public static void main(String[] args) {
        System.out.println("Tight Coupling");
        TightCoupling.makeVehicle();


        System.out.println("\nLoose Coupling");
        LooseCoupling.makeVehicle();
    }
}