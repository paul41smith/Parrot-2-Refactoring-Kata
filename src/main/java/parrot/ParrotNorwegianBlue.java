package parrot;

public final class ParrotNorwegianBlue extends Parrot {

    protected ParrotTypeEnum type;

    public ParrotNorwegianBlue(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
        this.type = ParrotTypeEnum.NORWEGIAN_BLUE;
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    public String getType() {
        return String.valueOf(type);
    }
}
