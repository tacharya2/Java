package udemy;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// create instances of MotorBike class
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		ducati.start();
		honda.start();

		// changing the state of these objects
		ducati.setSpeed(100);
//		System.out.println(ducati.getSpeed());
//		honda.setSpeed(45);
//		System.out.println(honda.getSpeed());
//		// can even change further
//
//		ducati.setSpeed(45);
//		honda.setSpeed(0);
//
//		System.out.println(ducati.getSpeed());

	}

}
