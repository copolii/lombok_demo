package ca.mahram.demo.lombok.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetterSetterTest {

    @Test
    public void getterSetterTest () {
        Shape shape = new Shape ();

        shape.setX (12);
        assertEquals (12, shape.getX ());

        shape.setY (55);
        assertEquals (55, shape.getY ());
    }

}