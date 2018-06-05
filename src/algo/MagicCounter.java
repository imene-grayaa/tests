package algo;

public class MagicCounter {
	
	int i=0;

	public void displayMagicalNumbers(int pIMin, int pIMax) {

		for (int i = pIMin; i < pIMax; i++) {
			if (i % 3 == 0)
				System.out.println("H");
			else if (i % 5 == 0)
				System.out.println("S");
			else
				System.out.println(i);

		}

	}

	public void displayMagicalNumber(int pIMin, int pIMax) {

		i = pIMin;
		do {
			System.out.println(i);
			i++;
		} while (!(i < pIMax));

	}

	public static void main(String[] args) {
		MagicCounter mMagicCounter = new MagicCounter();
		mMagicCounter.displayMagicalNumber(18, 10);
	}

}
