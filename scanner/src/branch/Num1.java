/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :장종익
 * @file   :Num1.java
 * @story  :
*/
public class Num1 {
	/**
	 * 저희 반은 학생 수가 3명입니다.
	 * 학생의 평균 점수는 0~100점 사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요. 동점은 없습니다.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * */
	public static void main(String[] args) {
		String name1 = "", name2 = "", name3 = "";
		int score1 = 0, score2 = 0, score3 = 0, num1 = 0, num2 = 0, num3 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 점수는?");
		score1 = scanner.nextInt();
		System.out.println("두번째 점수는?");
		score2 = scanner.nextInt();
		System.out.println("세번째 점수는?");
		score3 = scanner.nextInt();
		
		if(score1>score2 && score1>score3){
			if(score2>score3){
				
			}
			
			
		}
	}
}
