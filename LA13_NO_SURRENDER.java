import java.util.ArrayList;
import java.util.Scanner;
public class LA13_NO_SURRENDER {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many student you want to enter? ");
		int num = scan.nextInt();
		System.out.println("How many employee you want to enter? ");
		
		int num1 = scan.nextInt();
		Student s[] = new Student [num];
		Employee e[] = new Employee[num1];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Student: " + (1 + i));
			
			System.out.println("Enter your grade in Math: ");
			double Gmath = scan.nextDouble();
			System.out.println("Enter your grade in English: ");
			double Genglish = scan.nextDouble();
			System.out.println("Enter your grade in Programming: ");
			double Gprogramming = scan.nextDouble();
			
			s[i] = new Student();
			s[i].setGrades(Gmath, Genglish, Gprogramming);
			
		}
		
		for(int a = 0; a < num1; a++) {
			System.out.println("Employee: " + (a + 1));
			
			System.out.println("Enter rendered hours: ");
			int rH = scan.nextInt();
			System.out.println("Enter rate per hour: ");
			double rPh = scan.nextDouble();
			
			e[a] = new Employee();
			e[a].setRateAndRenderedHours(rPh, rH);
			
		}
		
		 for (int j = 0; j < s.length; j++) {
			 System.out.println("Average of Student: " + (1 + j) +". " +  String.format("%.2f", s[j].getAverage()));
		 }
		 
		 for (int em = 0; em < e.length; em++) {
			 System.out.println("Gross Pay of Employee: " + (1 + em) + ". " + String.format("%.2f", e[em].getGrossPay()));
		 }
		 
	}
}