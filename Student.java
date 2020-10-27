package Java_study;
//�л� Ŭ����
//�ʵ�: �й� �̸� ���� ���� ����
//�޼ҵ�:�� �ʵ忡 ���� getter/setter
//           ���� �� ��� ��� �ϴ� �޼ҵ�
//           �й��� �̸��� �������� �� equals()�޼ҵ�
//           toString()
public class Student {
	private String id;
	private String name;
	private int korean;
	private int english;
	private int math;
	//   ���ʵ� ����
	
	//   �� �ʵ忡 ���� getter and setter ����
	// (������� ���콺 ��Ŭ��, �ҽ�, ���ʷ���Ʈ ���� ���� ����)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int calculateSum() {
		return korean + english + math;
	}
	
	public double calculateAverage() {
		return calculateSum()  / 3.0;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student) o;
			if(this.name.equals(s.name)
					&& this.id.equals(s.id)) {
				return true;
			}
		}	
		
		
		
		
		return false;
	}
	
	public String toString() {
		return "�й�: "+id+
				", �̸�: "+name+
				", ��������: "+korean+
				"��, ��������:"+english+
				"��, ��������:"+math+
				"��,  ����: "+calculateSum()+
				"��, ���: "+calculateAverage()+"��";
	}
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student() {
		
	}
 
}
