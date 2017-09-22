//comment
// comment 2
public class CarTest{

	public static void main(String[] args){
		Car newCar = new Car("Toyota", "Corolla", "white", 2015);

		System.out.println("Speed is " + newCar.displaySpeed());

		System.out.printf("Speed is %d%n", newCar.displaySpeed());

		newCar.accelerate(10);

		System.out.println("Speed is " + newCar.displaySpeed());

		newCar.stop();

		System.out.println("Speed is " + newCar.displaySpeed());

	}
}