// 구구단 생성 프로젝트 진행
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("===============================");
			System.out.println("|구구단 생성 프로그램에 오신 것을 환영 합니다.|");
			System.out.println("|원하시는 구구단수, 곱셈의 수를 입력해 주세요|");
			System.out.println("===============================");
			System.out.println("Ex) 4,7 8,12 99,1000");
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.nextLine();
			String[] splitValue = inputValue.split(",");
			int num1 = Integer.parseInt(splitValue[0]);
			int num2 = Integer.parseInt(splitValue[1]);
			GugudanCalculator.calculator(num1, num2);
			
		}
		
		
		
	}
}