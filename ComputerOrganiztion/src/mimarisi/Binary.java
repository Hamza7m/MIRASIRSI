package mimarisi;

public class Binary {

	public static int[] ToBinary(int number) {
		int[] BinaryArray = new int[16];
		int index = BinaryArray.length - 1;
		while (number != 0) {
			BinaryArray[index] = number % 2;
			number = number / 2;
			index--;
		}
		return BinaryArray;
	}
}
