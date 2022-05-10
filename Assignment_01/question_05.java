package Assignment_01;

import java.util.Scanner;

public class question_05 {

	public static void main(String[] args) {

		System.out.println("HimanshuSingh_H_24");
		Employee arr[] = new Employee[8];
		String s;
		int age;
		String depart;
		int salary;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			s = scan.nextLine();
			age = scan.nextInt();
			depart = scan.next();
			salary = scan.nextInt();

			arr[i] = new Employee(s, age, depart, salary);

		}
//check total salary
		Employee result = new Employee();
		result.total_salary();

	}

}

class Employee {
	String name;
	int age;
	String Department;
	int salary;
	static int total_sal = 0;

	Employee() {
//Default one
	}

	Employee(String s, int a, String depart, int sal) {
		name = s;
		age = a;
		Department = depart;
		if (sal > 30000) {

		} else {

			salary = 25000;

			salary = sal;

		}
		total_sal += sal;
	}

	void total_salary() {
		System.out.println("Total salary is " + total_sal);
	}

}