package parrot;

public final class ParrotEuropean extends Parrot {

    protected ParrotTypeEnum type;

    public ParrotEuropean(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
        this.type = ParrotTypeEnum.EUROPEAN;
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    public String getType() {
        return String.valueOf(type);
    }
}
