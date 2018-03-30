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
        	// Print Output to Console
        	bw.flush();

        }catch(IOException ie){
        	ie.printStackTrace();
        }
        // End Program
        System.exit(1);
    }
}
