import org.junit.Test;
import parrot.Parrot;
import parrot.ParrotAfrican;
import parrot.ParrotEuropean;
import parrot.ParrotNorwegianBlue;
import parrot.ParrotTypeEnum;

import static org.junit.Assert.assertEquals;

public final class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        final Parrot parrot = new ParrotEuropean(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 12.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        final Parrot parrot = new ParrotAfrican(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 3.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        final Parrot parrot = new ParrotAfrican(ParrotTypeEnum.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        final Parrot parrot = new ParrotAfrican(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 12.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new ParrotNorwegianBlue(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, true);
        assertEquals(0.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = new ParrotNorwegianBlue(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 18.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = new ParrotNorwegianBlue(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.01);
        //        assertEquals(parrot.getSpeed(), 24.0);
    }
}