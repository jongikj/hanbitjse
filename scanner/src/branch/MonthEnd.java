/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :장종익
 * @file   :MonthEnd.java
 * @story  :
*/
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는 
	 * 프로그램.
	 * 단, 2월은 29일로 한정함.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력 값입니다. 라고 뜬다.
	 * */
	public static void main(String[] args) {
		int month = 0, endDay = 0;
		Scanner scanner = new Scanner(System.in);
	
		for(;;){
		System.out.println("월을 입력하세요.");		
		month = scanner.nextInt();

		switch (month) {
		case 1:
			endDay = 31;
			break;
		case 2:
			endDay = 29;
			break;
		case 3:
			endDay = 31;
			break;
		case 4:
			endDay = 30;
			break;
		case 5:
			endDay = 31;
			break;
		case 6:
			endDay = 30;
			break;
		case 7:
			endDay = 31;
			break;
		case 8:
			endDay = 31;
			break;
		case 9:
			endDay = 30;
			break;
		case 10:
			endDay = 31;
			break;
		case 11:
			endDay = 30;
			break;
		case 12:
			endDay = 31;
			break;
		default:
			System.out.println("1에서 12까지만 입력해주세요.");
			return;
		}
		
		System.out.println(month + "월은 " + endDay + "일까지 있습니다.");
		}
	}
}
