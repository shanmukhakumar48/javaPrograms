import java.util.Scanner;

public class EvenNumUsersGivenRange {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the 1st number");
//		int x=sc.nextInt();
//		System.out.println("enter the 2st number");
//		int y=sc.nextInt();
//		
//		for(int i=x;i<=y;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int x=sc.nextInt(); 
		System.out.println("enter the 2st number"); //OddNumbers
		int y=sc.nextInt();
		
		for(int i=x;i<=y;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	
}
