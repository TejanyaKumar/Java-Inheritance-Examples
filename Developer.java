package com;

public class Developer extends Employee {
    String programminglanguage;
    
    void details() {
    	 System.out.println("Developer name is " + name);
    	 System.out.println("Developer ID is " + id);
    }
    void code() {
    	System.out.println(name + " is developing code in ");
    }
}
