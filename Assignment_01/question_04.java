package Assignment_01;

public class question_04 {
public static void main(String[] args) {
	
	System.out.println("HimanshuSingh_H_24");
	ClassThree obj = new ClassThree(1); 
	ClassThree obj1 = new ClassThree(); 
	System.out.println("Q4");
}
}

class ClassOne
{
ClassOne(int x)
{
System.out.println("inside first class"+ x);
}
}

class ClassTwo extends ClassOne
{
ClassTwo()
{
super(4); // calls the constructor of ClassOne System.out.println("Inside second class");
}
}

class ClassThree extends ClassTwo
{
ClassThree(int y)
{
System.out.println("Inside third class(Parameterized Constructor)");
}
ClassThree()
{
System.out.println("Inside third class(default constructor)");
}
}