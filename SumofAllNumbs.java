import java.util.Scanner;
public class SumofAllNumbs {
public static void main(String[] args) {
        
	    int sum=0;
		
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int x=sc.nextInt();
        
		for(int i=1;i<=x;i++) {
		System.out.println(i);
            
		//sum +=i;
			
		sum=sum+i; 
		}
            
		System.out.println("The sum of numbers are = "+sum);
            
    }
}