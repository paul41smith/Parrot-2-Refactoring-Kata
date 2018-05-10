package parrot;

public abstract class Parrot {

    protected ParrotTypeEnum type;
    protected int numberOfCoconuts = 0;
    protected double voltage;
    protected boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
        switch (type) {
            case EUROPEAN:
            case AFRICAN:
            case NORWEGIAN_BLUE:
                break;
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    public abstract double getSpeed();

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }
}
