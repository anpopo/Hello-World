import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		// 출력을 원하는 단의 구구단을 입력받기
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("number : " + num);
		
		if (num < 2 || num > 9) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d%n", num, i, num * i);
			}
		}
	}
}