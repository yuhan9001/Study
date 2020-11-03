package java1111;
import java.util.Scanner;
public class work01 {

	public static void main(String[] args) {
		/*
		 편의점 
		 
		 지불해야할 금액: 3230원
		 자신의 금액:   10000원 
		 
		 거스름 돈:
		       5000원권 몇장
		       1000원권 몇장
		       500원 몇개
		       100원 몇개
		       10원 몇개
		 */
		
		//변수의 선언
		//거스름돈은 먼저 계산
		//
		
		Scanner scanner = new Scanner(System.in);
		int price;    //지불할돈
		int payment;  //내돈
		int result;   //거스름돈
		
		System.out.println("지불해야할 금액:");
		price = scanner.nextInt();
		//스케너로 지불해야할 금액을 입력받고
		
		System.out.println("자신의 금액:");
		payment = scanner.nextInt();
		result = payment - price;
		System.out.println("거스름돈: "+result);
		//자신의 금액을 입력
		
		int fiveTh = result / 5000;
		System.out.println("오천원:"+fiveTh);
		//거스름 돈을 5000원으로 나눠서 나눠지는 수 출력(5천원 지폐 수)
		result = result % 5000;
		System.out.println(result);
		//5천원으로 나눠지는걸 제외한 나머지 거스름돈 출력(잔돈 result)
		
		int oneTh = result / 1000;
		System.out.println("천원:"+oneTh);
		result = result % 1000;
		System.out.println(result);
		//5천원과 마찬가지로 10원까지 반복 ㅠㅠ
		int fivehd = result / 500;
		System.out.println("오백원:"+fivehd);
		result = result % 500;
		System.out.println(result);
		
		int onehd = result / 100;
		System.out.println("백원:"+onehd);
		result = result % 100;
		System.out.println(result);
		
		int fiveft = result / 50;
		System.out.println("오십원:"+fiveft);
		result = result % 50;
		System.out.println(result);
		
		int ten = result / 10;
		System.out.println("십원:"+ten);
		result = result % 0;
		System.out.println(result);
		
		
		
		
		
		
		

	}

}
