package parrot;

public final class ParrotEuropean extends Parrot {

    public ParrotEuropean(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(_type, numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return getBaseSpeed();
    }
}
