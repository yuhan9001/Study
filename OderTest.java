package calsspart;

public class OderTest {

	public static void main(String[] args) {
		
		Oder od1 = new Oder();
		
		od1.oderNumber = 201907210001L;
		od1.Id = "abc123";
		od1.day = "2019년 7월 21일";
		od1.name = "홍길순";
		od1.itemNumber = "PD0345";
		od1.address = "화성특별시 분화구 용암면 녹으리 119번지";
		
		System.out.println("주문 번호: " + od1.oderNumber);
		System.out.println("주문자 아이디: " + od1.Id);
		System.out.println("주문 날짜: " + od1.day);
		System.out.println("주문자 이름: " + od1.name);
		System.out.println("주문 번호: " + od1.itemNumber);
		System.out.println("배송 주소: " + od1.address);
				

	}

}
