package udemy;

public class Book {
	private int copy;

	void setCopy(int copy) {
		this.copy = copy;
	}

	int getCopy() {
		return this.copy;
	}
	void read() {
		System.out.println("My most favorite Java Books");
	}

	public void increaseCopy(int howMuch) {
		this.copy += howMuch;

	}

	public void decreaseCopy(int howMuch) {
		this.copy -= howMuch;

	}
}
