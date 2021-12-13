package day2;

public class Assesment1 { 
	
public static void main(String[] args) {
	//1 - try block
	//2 - catch block
try
        {
            throw new NullPointerException("demo");
        }
     catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; 
        }
}
	class Demo{
	//3 - inside any method or any block
	static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }
}
}



