import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		int mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x = ");
		int x=sc.nextInt();
		
		for(int i=x;i>=1;i--) {
			System.out.println(i);
		    mul *=i; 
		}
            
		System.out.println("The sum of numbers are = "+mul);
	}
}	