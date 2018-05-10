package parrot;

public final class ParrotAfrican extends Parrot {

    protected ParrotTypeEnum type;

    public ParrotAfrican(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
        this.type = ParrotTypeEnum.AFRICAN;
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    public String getType() {
        return String.valueOf(type);
    }
}
