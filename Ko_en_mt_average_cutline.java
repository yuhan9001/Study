//사용자로부터 국영수 점수를 입력받기.
//합격 커트라인: 평균70점, 과목당 60점이상.
//위의 조건이 안맞으면 불합격.
//잘못 입력된 점수가 있을시 모든 입력이 끝난후에  잘못되었다고표시.
import java.util.Scanner;
public class Ko_en_mt_average_cutline {
    final static int NUMBER_OF_SUBJECTS = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
	    System.out.println("국어 점수: ");
		int korean = scanner.nextInt();
		System.out.println("영어 점수: ");
		int english = scanner.nextInt();
		System.out.println("수학 점수: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / (double)NUMBER_OF_SUBJECTS;
		
		//먼저 입력된 점수들이 올바른지부터 체크
		boolean isKoreanCorrect = korean >= 0 && korean<=100;
		boolean isEnglishCorrect = english >=0 && english <=100;
		boolean isMathCorrect = math >= 0 && math<=100;
		
		if(isKoreanCorrect && isEnglishCorrect && isMathCorrect) {
			//올바른 점수이므로 합격/불을 if문으로 통해 결정
			if(average >= 70 && korean >=60 && english >= 60 && math >=60 ) {
				System.out.println("합격입니다!");
			}else {
				System.out.println("탈락입니다!");
			}
		}else {
			//↓잘못된 점수 입력, 경고 출력 ↓
			System.out.println("잘못된 점수가 입력됐습니다.");
		}
		
		
		
		
		
		
		
		
		
		scanner.close();
			
		}
		
	
	}




















