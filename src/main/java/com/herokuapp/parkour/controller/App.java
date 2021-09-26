package com.herokuapp.parkour.controller;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import com.herokuapp.parkour.model.Parking;
import com.herokuapp.parkour.model.Car;

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
        	
        	// Get Command from shell
        	String str = br.readLine();
        	// Initialize Object
        	Parking lot = null;

        	// Check for the new command input
        	while(str != null){
        		// Get the command from string
        		String [] command = str.split(" ");
        		// Choose command
        		switch(command[0]){
        			// Create Parking Lot
        			case "create_parking_lot":
        				lot = new Parking(Integer.parseInt(command[1]));
        				bw.write(lot.toString());
        				break;
        			// Car park in the Parking Lot
        			case "park":
        				bw.write(lot.park(new Car(command[1], command[2])));
        				break;
        			// Number of car leaving the Parking Lot
        			case "leave":
        				bw.write(lot.leave(Integer.parseInt(command[1])));
        				break;
        			// Check registration number
        			case "registration_numbers_for_cars_with_colour":
        				bw.write(lot.getPlateByColor(command[1]));
        				break;
        			// Check Slot Number for specific color
        			case "slot_numbers_for_cars_with_colour":
        				bw.write(lot.getSlotByColor(command[1]));
        				break;
        			// Check slot Number for specific registration number
        			case "slot_number_for_registration_number":
        				bw.write(lot.getSlotByPlate(command[1]));
        				break;
        			// Check the status of parking lot
        			default:
        				bw.write(lot.status());
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
