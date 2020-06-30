// 구구단 생성 프로젝트 진행
import java.util.Scanner;


public class Gugudan {
	 static String[] calculator(int times) {
		String[] guguList = new String[9];
		for (int i = 0; i < guguList.length; i++) {
			guguList[i] = String.format("%d * %d = %d", times, i + 1, times * i);
		}
		return guguList;
	}
	
	 static void printer(String[] list) {
		 for (int i = 0;  i < list.length; i++) {
			 System.out.println(list[i]);
		 }
	 }
	
	
	
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("|구구단 생성 프로그램에 오신 것을 환영 합니다.|");
		System.out.println("|    원하시는 구구단수를 입력해 주세요!   |");
		System.out.println("===============================");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			if (num < 2 || num > 9) {
				System.out.println("2와 9사이의 숫자를 넣어주세요~");
			} else {
				System.out.println("단수 : " + num);
				System.out.println(num + "단을 출력합니다 :)");
				printer(calculator(num));
				System.out.println("원하시는 숫자를 입력해주세요!");
				continue;
			}
		}
		
		
		
	}
}