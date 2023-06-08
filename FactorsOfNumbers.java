import java.util.Scanner;

public class FactorsOfNumbers {

	public static void main(String[] args) {
		int num=12;
		for(int i=1;i<=num;i++) {
         
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println();                   //input from users 
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}