package com.mycompany.app;

import com.mycompany.app.Car;
/**
* Parking Lot Class where the car is stored
*/

class Parking{
	
	/**
	* Class Variable
	*/ 
	private int size;
	private int allocated;
	private Car [] lot;
	private StringBuilder sb;

	/**
	* Constructor
	* @param size slots in the parking lot
	*/
	public Parking(int size){
		this.size = size;
		this.allocated = 0;
		this.lot = new Car[size];
		this.toString();
	}

	/**
	* Override method to return output console
	* @return the string of created parking lot
	*/
	@Override
	public String toString(){
		this.sb = new StringBuilder();
		this.sb.append("Created a parking lot with ");
        this.sb.append(this.size).append(" slots\n");
        return this.sb.toString();
	}

	/**
	* Method get the size of parking lot
	* @return size of the parking lot
	*/ 
	public int getSize(){
		return this.size;
	}

	/**
	* Method set the size of parking lot
	* @param size of the new desired parking slot
	*/
	public void setSize(int size){
		this.size = size;
	}

	/**
	* Method Parking the car to the slot
	* @param Car object that park in the parking lot
	* @return String of the parked car
	*/
	public String park(Car lot){
		this.sb = new StringBuilder();
		if (this.lot[this.allocated] == null){
			this.sb.append("Allocated slot number: ");
			this.lot[this.allocated] = lot;
			this.allocated += 1;
			this.sb.append(this.allocated).append("\n");
		}else{
			this.sb.append("Sorry, parking lot is full\n");
		}
		return this.sb.toString();
	}

	/**
	* Method car leaving from the parking slot
	* @param allocated iterator of the parking lot
	* @return String of the leaved car
	*/ 
	public String leave(int allocated){
		this.sb = new StringBuilder();
		this.sb.append("Slot number ").append(allocated);
		this.sb.append(" is free\n");
		this.allocated = allocated - 1;
		this.lot[this.allocated] = null;
		return this.sb.toString();
	}

}