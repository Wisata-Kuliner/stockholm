
/**
* Parking Lot Class where the car is stored
*/

class Parking{
	
	/**
	* Class Variable
	*/ 
	private int size;

	/**
	* Constructor
	*/
	public Parking(int size){
		this.size = size;
	}

	/**
	* Method Setter / Getter
	*/ 

	public int getSize(){
		return this.size;
	}

	public void setSize(int size){
		this.size = size;
	}

}