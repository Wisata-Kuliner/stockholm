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
	private Car [] lot;
	// String variable to append output console
	private StringBuilder sb;

	/**
	* Constructor
	* @param size slots in the parking lot
	*/
	public Parking(int size){
		this.size = size;
		// Initialize the array structure data with desired size
		this.lot = new Car[size];
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
		// Iterate empty slot that nearest to the entry
		for (int i = 0;  i < this.lot.length; i++){
			if (this.lot[i] == null){
				this.sb.append("Allocated slot number: ");
				this.lot[i] = lot;
				this.sb.append((i+1)).append("\n");
				return this.sb.toString();
			}
		}
		// There is no empty slot
		return "Sorry, parking lot is full\n";
	}

	/**
	* Method car leaving from the parking slot
	* @param slot of the parking lot
	* @return String of the leaved car
	*/ 
	public String leave(int slot){
		this.sb = new StringBuilder();
		this.sb.append("Slot number ").append(slot);
		this.sb.append(" is free\n");
		// Remove from the structure data
		this.lot[slot - 1] = null;
		return this.sb.toString();
	}

	/**
	* Method get status of every slots
	* @return every car in the parking lot
	*/
	public String status(){
		this.sb = new StringBuilder();
		this.sb.append("Slot No.\tRegistration No.\tColour\n");
		// Iterate every slot in parking lot
		for (int i = 0; i < this.lot.length; i++){
			if (this.lot[i] != null){
				this.sb.append((i+1)).append("\t");
				this.sb.append(this.lot[i].getPlate()).append("\t");
				this.sb.append(this.lot[i].getColor()).append("\n");
			}
		}
		return this.sb.toString();
	}

	/**
	* Method search car number plate with desired color
	* @param color of the car that desired
	* @return string list of car with desired color
	*/
	public String getPlateByColor(String color){
		this.sb = new StringBuilder();
		// Search every car plate in parking lot that match the desired color
		for (int i = 0; i < this.lot.length; i++){
			if (this.lot[i] != null && this.lot[i].getColor().equalsIgnoreCase(color)){
				this.sb.append(this.lot[i].getPlate()).append(", ");
			}
		}
		return this.sb.toString().substring(0, this.sb.toString().length() - 2) + "\n";
	}

	/**
	* Method show slot for desired color
	* @param color of the car that desired
	* @return slot number for desired car color
	*/
	public String getSlotByColor(String color){
		this.sb = new StringBuilder();
		// Iterate every car slot in parking lot that match desired car color
		for (int i = 0; i < this.lot.length; i++){
			if (this.lot[i] != null && this.lot[i].getColor().equalsIgnoreCase(color)){
				this.sb.append((i+1)).append(", ");
			}
		}
		return this.sb.toString().substring(0, this.sb.toString().length() - 2) + "\n";
	}

	/**
	* Method show wlot for desired plate
	* @param plate of the car that desired
	* @return slot number for desired car plate
	*/
	public String getSlotByPlate(String plate){
		this.sb = new StringBuilder();
		// Search every car slot that match desired car plate
		for (int i = 0; i < this.lot.length; i++){
			if (this.lot[i] != null && this.lot[i].getPlate().equalsIgnoreCase(plate)){
				this.sb.append((i+1)).append(", ");
			}
		}
		// Handle there is no matched slot with desired car plate
		if (this.sb.toString().equalsIgnoreCase("")){
			return "Not found\n";
		}
		return this.sb.toString().substring(0, this.sb.toString().length() - 2) + "\n";
	}

}