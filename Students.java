package assignment3_W3D1;

public class Students {

	public void getStudentInfo(int a) {
		System.out.println("STudent ID is "+a);

	}
	public void getStudentInfo(int a, String Name) {
		System.out.println("STudent ID is "+a);
		System.out.println("STudent Name is "+Name);

	}
	public void getStudentInfo(String email, int Num) {
		System.out.println("STudent email is "+email);
		System.out.println("STudent Num is "+Num);

	}
		
	public static void main(String[] args) {
		Students stdObj = new Students();
		stdObj.getStudentInfo(7774);
		stdObj.getStudentInfo(7774, "RAJ");
		stdObj.getStudentInfo("abc@gmail.com", 999999999);

	}

}
