package ch02;

public class StudentClassTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); 
		//생성자, student 하나(객체=인스턴스)를 생성해라.
		//Lee라는 학생 한 명이 생긴거임.(여러 개의 인스턴스 생성가능)
				
		//Lee 학생의 정보입력
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address="서울 강남구";
		studentLee.showStudentInfo();

		//다른 학생의 인스턴스 생성
		Student studentJeon = new Student();
		studentJeon.studentID = 18615042;
		studentJeon.address= "대전 서구 정림서로114";
		studentJeon.studentName="전세윤";
				
		studentJeon.showStudentInfo();

	}

}
