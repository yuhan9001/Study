//����ڷκ��� ������ ������ �Է¹ޱ�.
//�հ� ĿƮ����: ���70��, ����� 60���̻�.
//���� ������ �ȸ����� ���հ�.
//�߸� �Էµ� ������ ������ ��� �Է��� �����Ŀ�  �߸��Ǿ��ٰ�ǥ��.
import java.util.Scanner;
public class Ko_en_mt_average_cutline {
    final static int NUMBER_OF_SUBJECTS = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
	    System.out.println("���� ����: ");
		int korean = scanner.nextInt();
		System.out.println("���� ����: ");
		int english = scanner.nextInt();
		System.out.println("���� ����: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / (double)NUMBER_OF_SUBJECTS;
		
		//���� �Էµ� �������� �ùٸ������� üũ
		boolean isKoreanCorrect = korean >= 0 && korean<=100;
		boolean isEnglishCorrect = english >=0 && english <=100;
		boolean isMathCorrect = math >= 0 && math<=100;
		
		if(isKoreanCorrect && isEnglishCorrect && isMathCorrect) {
			//�ùٸ� �����̹Ƿ� �հ�/���� if������ ���� ����
			if(average >= 70 && korean >=60 && english >= 60 && math >=60 ) {
				System.out.println("�հ��Դϴ�!");
			}else {
				System.out.println("Ż���Դϴ�!");
			}
		}else {
			//���߸��� ���� �Է�, ��� ��� ��
			System.out.println("�߸��� ������ �Էµƽ��ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		scanner.close();
			
		}
		
	
	}




















