
public class GugudanCalculator {
	public static void calculator(int num1, int num2) {
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
	}
}
