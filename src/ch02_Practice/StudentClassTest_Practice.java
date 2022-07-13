package ch02_Practice;

public class StudentClassTest_Practice {

	public static void main(String[] args) {
		
		Student_Practice studentLee = new Student_Practice(); 
		//생성자, student 하나(객체=인스턴스)를 생성해라.
		//Lee라는 학생 한 명이 생긴거임.(여러 개의 인스턴스 생성가능)
				
		//Lee 학생의 정보입력
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address="서울 강남구";
		studentLee.showStudentInfo();

		//다른 학생의 인스턴스 생성
		Student_Practice studentJeon = new Student_Practice();
		studentJeon.studentID = 18615042;
		studentJeon.address= "대전 서구 정림서로114";
		studentJeon.studentName="전세윤";
				
		studentJeon.showStudentInfo();

	}

}
