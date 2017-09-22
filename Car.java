//comment

public class Car{

	//instantaneous variables
	String model;
	String make;
	String color;
	int year;
	int speed;

	//constructor
	public Car(String model, String make, String color, int year){
		this.model = model;
		this.color = color;
		this.year = year;
		this.make = make;
	}

	//method to accelerate
	public void accelerate(int acc){
		speed = speed + acc;
	}

	//method to stop
	public void stop(){
		speed = 0;
	}

	//method to change color of car
	public void setColor(String color){
		this.color = color;
	}

	//method to display speed
	public int displaySpeed(){
		return speed;
	}

	//method to display information


	
}