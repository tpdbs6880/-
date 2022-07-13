package ch02_Practice;

public class Student_Practice {

	public int studentID;
	public String studentName;
	public String address;

	public void setStudentName(String string) {

		studentName=string; //입력받은 이름을 studentName변수에 넣어 출력
	
	}
	
	public void showStudentInfo() { //입력 받은 학생의 정보 출력하는 함수
		
		System.out.println("학번 " + studentID + "인 학생의 이름은 "+
	studentName + "이고 집 주소는 " + address + "이다.");
	
	}
	
	
	

}
