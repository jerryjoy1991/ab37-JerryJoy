package access_specifier_01;

//  60- 1.c outside package by becoming subclass

import access_specifier_02.Teacher_02;

public class Student_02 extends Teacher_02{

	public static void main(String[] args) {
		Student_02 s1=new Student_02();
		s1.add();
		s1.div();
	}

}
