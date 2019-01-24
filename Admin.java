package capgeminiMudit;
import java.util.Scanner;

public class Admin {

	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();
	
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		
		int choice;
		
		while(true)
		{
			System.out.println("1.add student");
			System.out.println("2.show all students");
			System.out.println("3.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:addStudentDetails();
			       break;
			       
			 case 2:showAllStudents();
			        break;
			 default:System.out.println("Sorry entered wrong choice");
			}
			
		}
		
	}

	private static void showAllStudents() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		studSch.showData(rollNumber);
		
		
	}

	private static void addStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		
		System.out.println("Enter no of courses");
		int noofcourse=sc.nextInt();
		String[] course=new String[noofcourse];
		for(int i=0;i<noofcourse;i++)
		{
			course[i]=sc.next();
		}
		studSch.addData(rollNumber, name,course);
	}

}