package com.mycompany.app;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Main Application Class
 *
 */
public class App {
	/**
	* Main Method
	*/
    public static void main( String[] args ) {
        try{
        	// Initialize Input & Output
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        	
        	bw.write( "Hello World!\n" );
        	// Get Command from shell
        	String str = br.readLine();
        	// Check for the new command input
        	while(str != null){
        		// Get the command from string
        		String [] command = str.split(" ");
        		// Choose command
        		switch(command[0]){
        			// Create Parking Lot
        			case "create_parking_lot":
        				break;
        			// Car park in the Parking Lot
        			case "park":
        				break;
        			// Number of car leaving the Parking Lot
        			case "leave":
        				break;
        			// Check registration number
        			case "registration_numbers_for_cars_with_colour":
        				break;
        			// Check Slot Number for specific color
        			case "slot_numbers_for_cars_with_colour":
        				break;
        			// Check slot Number for specific registration number
        			case "slot_number_for_registration_number":
        				break;
        			// Check the status of parking lot
        			default:
        				break;
        		}
        		// Print Output to Console
        		bw.flush();
        		// Receive another input
        		str = br.readLine();
        	}

        // Catch Input our Output Exception for Buffer
        }catch(IOException ie){
        	ie.printStackTrace();
        }
        // End Program
        System.exit(1);
    }
}
