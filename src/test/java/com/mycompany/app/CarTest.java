package com.mycompany.app;

import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;

import com.mycompany.app.AppTest;
import com.mycompany.app.Car;

/**
 * Unit test for Parking Class.
 */
public class CarTest extends AppTest{
    
    RandomStringUtils generator;
    Car random;
    String str;

    /**
     * Constructor
     */
    public CarTest( String testName ){
        super( testName );
        this.generator = new RandomStringUtils();
        this.random = new Car(generator.random((int) Math.random()),generator.random((int) Math.random()));
    }

    @Test
    public void testPlate(){
        this.str = this.generator.random((int) Math.random());
        assertEquals(str, this.random.getPlate());
    }

    @Test
    public void testColor(){
        this.str = this.generator.random((int) Math.random());
        assertEquals(str, this.random.getColor());
    }

}
