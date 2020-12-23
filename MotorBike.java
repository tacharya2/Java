package udemy;

public class MotorBike {
	// state. Once we put private, we can no longer use this state outside of this
	// class

	private int speed; // class/member variable

	// behavior. To make that possible, we use access modifier

	void setSpeed(int speed) { // this speed is a local variable

		System.out.println(speed);// 100
		System.out.println(this.speed);// 0
		this.speed = speed;
	}

	int getSpeed() {
		return this.speed;

	}

	void start() {
		System.out.println("Started");
	}

}
