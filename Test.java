package com;

public class Test {
       public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Roshan";
		emp.id = 102;
		
		
		Developer Dev = new Developer();
		Dev.name = "Teja";
		Dev.id = 107;
		Dev.programminglanguage = "Java";
	
		emp.details();
		emp.work();
		
		System.out.println("____________________________________________________");
	    Dev.details() ;
	    Dev.work();
	    Dev.code();

	}
}
