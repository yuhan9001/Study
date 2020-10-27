package Java_study;
import java.util.ArrayList;
import java.util.Scanner;

//Arrat List�� ����� �л� ��ü ���� ���α׷�
import Java_study.Student;
public class GaradeBook {
	//Student ��ü�� ����� ���ؼ���
	//�츮�� �ٸ� ��Ű���� �ִ� Student Ŭ������
	//import �ؿ;� �Ѵ�,
	
	//�� import�� �������� ���� �ش� Ŭ������ ��Ű���� �ȴ�.
	//import�� �� �뿡�� �ش� Ŭ���� �̸��� ����
	//ctrl+space ������ �ҷ��ü� �ִ�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		while(true){
			System.out.println("1. �Է� 2. ��� 3. ����");
			int userChoice = scanner.nextInt();
			
			if(userChoice ==1) {
				//�л� ��ü�� �����
				//������ �Է��ؼ�
				//����Ʈ�� �߰�
				
				//������ ���� �л� ��ü ����
				Student s = new Student();
				
				System.out.println("�̸�: ");
				s.setName(scanner.nextLine());
				
				System.out.println("�й�: ");
				s.setId(scanner.nextLine());
				
				s.setKorean(Java_study.Student11.validateScore("����",scanner));
				s.setEnglish(Java_study.Student11.validateScore("����",scanner));
				s.setMath(Java_study.Student11.validateScore("����",scanner));
				
				list.add(s);
				
			}else if(userChoice==2) {
				//����Ʈ ��ü ���
				//���� �Ѹ� �Էµ��� �ʾ����� "�Էµ� ������ ����"�� ������ְ�
				//�Է��� ������ ���
				if(list.size() ==0) {
					//�Ѹ� �Է� �ȵ����Ƿ� ��� �޽��� ���
					System.out.println("�Էµ� ������ �������� �ʽ��ϴ�.");
				}else {
					for(int i=0; i<list.size(); i++) {
						System.out.println(list.get(i));
					}
					
				}
			}else if(userChoice ==3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		
		scanner.close();
		
	}
	

}
