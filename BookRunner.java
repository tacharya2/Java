package udemy;

public class BookRunner {

	public static void main(String[] args) {
		Book ArtOfComputerProgramming = new Book();
		Book EffectiveJava = new Book();
		Book CleanCode = new Book();

		ArtOfComputerProgramming.read();
		EffectiveJava.read();
		CleanCode.read();

		// status updated
		ArtOfComputerProgramming.setCopy(1200);
		EffectiveJava.setCopy(600);
		CleanCode.setCopy(1500);

		ArtOfComputerProgramming.increaseCopy(100);
		ArtOfComputerProgramming.decreaseCopy(600);

		System.out.println(ArtOfComputerProgramming.getCopy());
		System.out.println(EffectiveJava.getCopy());

		// status change
		ArtOfComputerProgramming.setCopy(900);
		EffectiveJava.setCopy(800);
		CleanCode.setCopy(1400);


	}


}
