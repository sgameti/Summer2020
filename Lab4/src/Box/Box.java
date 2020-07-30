
package Box;

public class Box {

	public int size = 0;

	public void printBox() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

	void printBox(char c) {
		for (int r = 0; r < size; r++) {
			for (int d = 0; d < size; d++) {
				System.out.println("c");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Box myBox = new Box();

		myBox.size = 10;

		myBox.printBox();
		myBox.printBox('c');

	}

}