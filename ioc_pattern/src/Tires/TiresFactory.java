package Tires;

public class TiresFactory {

    public Tire createTire(TireType tireType) {
        if (tireType == null) {
            return null;
        }
        if (tireType.equals(TireType.MICHELIN)) {
            return new MichelinTires();
        } else if (tireType.equals(TireType.BRIDGESTONE)) {
            return new BridgestoneTires();
        }
        return null;
    }
}
