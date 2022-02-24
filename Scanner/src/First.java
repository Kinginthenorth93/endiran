import java.util.Scanner;


public class First {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = scan.nextLine();
		
		System.out.println("Your name is" + name);		
				
		System.out.println("what is your age?");
		
		int age = scan.nextInt();
		
		System.out.println("your age is " + age);		
	
		System.out.println("Please enter your Email ID");
		
		String email= scan.nextLine();
		
		System.out.println("your mail id is " + email);
		
		System.out.println("Gender");
		
		String Gender = scan.nextLine();		
		
		System.out.println("Gender is " + Gender);
	}

}
