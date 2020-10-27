package Java_study;
import java.util.ArrayList;
import java.util.Scanner;

//Arrat List를 사용한 학생 단체 관리 프로그램
import Java_study.Student;
public class GaradeBook {
	//Student 객체를 만들기 위해서는
	//우리가 다른 패키지에 있는 Student 클래스를
	//import 해와야 한다,
	
	//즉 import의 기준점은 현재 해당 클래스의 패키지가 된다.
	//import를 할 대에는 해당 클래스 이름을 적고
	//ctrl+space 눌러서 불러올수 있다
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		while(true){
			System.out.println("1. 입력 2. 출력 3. 종료");
			int userChoice = scanner.nextInt();
			
			if(userChoice ==1) {
				//학생 객체를 만들고
				//정보를 입력해서
				//리스트에 추가
				
				//정보를 넣을 학생 객체 생성
				Student s = new Student();
				
				System.out.println("이름: ");
				s.setName(scanner.nextLine());
				
				System.out.println("학번: ");
				s.setId(scanner.nextLine());
				
				s.setKorean(Java_study.Student11.validateScore("국어",scanner));
				s.setEnglish(Java_study.Student11.validateScore("영어",scanner));
				s.setMath(Java_study.Student11.validateScore("수학",scanner));
				
				list.add(s);
				
			}else if(userChoice==2) {
				//리스트 전체 출력
				//만약 한명도 입력되지 않았으면 "입력된 정보가 없다"를 출력해주고
				//입력이 됐으면 출력
				if(list.size() ==0) {
					//한명도 입력 안됐으므로 경고 메시지 출력
					System.out.println("입력된 핛ㅇ이 존재하지 않습니다.");
				}else {
					for(int i=0; i<list.size(); i++) {
						System.out.println(list.get(i));
					}
					
				}
			}else if(userChoice ==3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		
		
		scanner.close();
		
	}
	

}
