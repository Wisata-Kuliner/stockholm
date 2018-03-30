
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
	*/
	public Car(String plate, String color){
		this.plate = plate;
		this.color = color;
	}

	/**
	* Method Setter / Getter
	*/ 
		
	public String getPlate(){
		return this.plate;
	}

	public void setPlate(String plate){
		this.plate = plate;
	}

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		this.color = color;
	}

}