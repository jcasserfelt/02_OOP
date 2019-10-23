package Sprint2.UtanFactoryPatternSkoj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirkelTest extends Figur {

    Cirkel c = new Cirkel(10, 0, 0);

    @Test
    void testArea() {
        assertTrue(c.area() == c.radie * c.radie * Math.PI);
    }

    @Override
    double area() {
        return 0;
    }
}
