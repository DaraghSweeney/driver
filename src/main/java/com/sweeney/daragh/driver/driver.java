package com.sweeney.daragh.driver;

import org.joda.time.LocalDate;

import com.sweeney.daragh.student_reg.courseProgramme;
import com.sweeney.daragh.student_reg.module;
import com.sweeney.daragh.student_reg.student;

public class driver {

	public driver() {
		
		//create student objects
		student alice = new student("Alice", 18, 1, 1, 1996, 1001);
		student bob = new student("Bob", 20, 1, 1, 1997, 1002);
		student charlie = new student("Charlie", 19, 1, 1, 1996, 1003);
		student dona = new student("Donna", 21, 1, 1, 1995, 1004);
		student eli = new student("Eli", 18, 1, 1, 1999, 1005);
		student fred = new student("Fred", 21, 1, 1, 1996, 1006);
		
		//create module objects
		module softwareEng = new module("SoftwareEng", "101");
		module nextGenTech = new module("NextGenTech", "102");
		module programming = new module("Programming", "103");
		module AI = new module("AI", "104");
		
		//both courses have the same start and end dates 
		LocalDate start = new LocalDate(2017,9,1);
		LocalDate end = new LocalDate(2018,5,1);
		
		//create course objects
		courseProgramme CSIT = new courseProgramme("CSIT", start, end);
		courseProgramme ECE = new courseProgramme("ECE", start, end);
		
		//add students to modules
		softwareEng.addStudent(alice);
		softwareEng.addStudent(bob);
		nextGenTech.addStudent(alice);
		nextGenTech.addStudent(bob);
		programming.addStudent(charlie);
		programming.addStudent(dona);
		AI.addStudent(eli);
		AI.addStudent(fred);
		
		//add modules to the course
		CSIT.addModule(softwareEng);
		CSIT.addModule(nextGenTech);
		ECE.addModule(programming);
		ECE.addModule(AI);
		
		System.out.println("List of courses available at Sweeney IT.");
		displayResults(CSIT);
		displayResults(ECE);
	}
	
	//this method gets the course and prints the modules and students for the course
	public void displayResults(courseProgramme c) {
		System.out.println("Course name:"+c.getCourseName().toString());
		for(module i: c.getModules()) {
			System.out.println("Module name:"+i.getModuleName().toString());
			
			for(student s:i.getListStudents()) {
				System.out.println(s.getName().toString());
			}
			System.out.println("");
		}
	}
	
	//create an instance of the driver object
	public static void main (String args[]) {
		driver d = new driver();
	}
}