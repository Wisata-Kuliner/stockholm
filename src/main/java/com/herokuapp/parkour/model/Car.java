package com.herokuapp.parkour.model;

import lombok.Getter;
import lombok.Setter;

/**
* Car Class where the information about the cars that parked
*/
@Setter
@Getter
public class Car {
	
	/**
	* Class Variable
	*/ 
	private String plate;
	private String color;

	/**
	* Constructor
	* @param plate number of the car that parked
	* @param color of the car that parked
	*/
	public Car(String plate, String color){
		this.plate = plate;
		this.color = color;
	}

}