import java.util.Scanner;

    public class DifferenceOfOddEvenNumbs {
	public static void main(String[] args) {
	int sum=0,sum1=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number");
	int x=sc.nextInt();
	System.out.println("enter the number");
	int y=sc.nextInt();
	System.out.println("EVEN numbers are = ");
	for(int i=x;i<=y;i++) {
		if(i%2==0) {
			System.out.println(i);
			
			//sum =sum+i;
			sum +=i;
			System.out.println(sum);
		    
		}
	}
System.out.println("ODD numbers are = ");
	for(int i=x;i<=y;i++) {
		if(i%2==1) {
			System.out.println(i);
			
			sum1 =sum1+i;
			System.out.println(sum1);

		}
		int difference=sum-sum1;
		System.out.println("the difference is = "+difference);
	}
  }     //done
}