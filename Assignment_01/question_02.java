package Assignment_01;

public class question_02 {
public static void main(String[] args) { 
	
	System.out.println("HimanshuSingh_H_24");
	check o1 = new check(); 
	check o2 = new check(); 
	check o3 = new check();
	check o4 = new check();

	o1.method();
	o2.method();
	o3.method();
	o4.method();
	//get result 
	o3.print_count();
	System.out.println("Question_02");
	}
	
}
	
	class check
	{
	static int count = 0;
	
	void method()
	{
	count++;
	}
	void print_count()
	{
	System.out.println("Number of times method is called is "+count);
  }
}
