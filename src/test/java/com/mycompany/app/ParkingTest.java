package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.AppTest;
import com.mycompany.app.Parking;

/**
 * Unit test for Parking Class.
 */
public class ParkingTest extends AppTest{
    
    int random;
    String str;
    Parking lot;

    /**
     * Constructor
     */
    public ParkingTest( String testName ){
        super( testName );
        this.random = (int) Math.random();
        this.lot = new Parking(this.random);
    }

    @Test
    public void testCreate(){
        this.str = "Created a parking lot with" + this.random + "slots";
        assertEquals(str, this.lot.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testPark(){
        this.str = "Slot No.\tRegistration No.\tColour";
        assertEquals(str, this.lot.status());
    }

}
