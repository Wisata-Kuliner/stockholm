package com.mycompany.app;

/**
* Car Class where the information about the cars that parked
*/

class Car{
	
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

	/**
	* Method Get number plate of specific car
	* @return the plate of the car
	*/ 
	public String getPlate(){
		return this.plate;
	}

	/**
	* Method set number plate of specific car
	* @param plate of the new desired for the car
	*/
	public void setPlate(String plate){
		this.plate = plate;
	}

	/**
	* Method get color of specific car
	* @return the color of the car
	*/
	public String getColor(){
		return this.color;
	}

	/**
	* Method set color of specific car
	* @param color of the new desired for the car
	*/
	public void setColor(String color){
		this.color = color;
	}

}