package ch02;

public class Student {
	
	public int studentID; //학생의 학번
	public String studentName;  //학생의 이름
	public String address; //학생의 집 주소
	
	public void showStudentInfo() { //입력 받은 학생의 정보 출력하는 함수
		System.out.println("학번 " + studentID + "인 학생의 이름은 "+
	studentName + "이고 집 주소는 " + address + "이다.");
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}


}
