package access_specifier_01;

// Assignment_ 59

import access_specifier_02.Teacher_01;

public class Student_01{

	public static void main(String[] args) {
		Teacher_01 t1=new Teacher_01();
		
			t1.add();  // can access only public method of teacher_01 class of package - access_specifier_02
			
	}

}
