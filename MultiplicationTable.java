import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number = ");
		int x=sc.nextInt();
		
	//	for(int i=x;i<=10;i++) {
			
			for(int j=1;j<=12;j++) {
				System.out.println(x+"*"+j+"="+(x*j));
			}
		}
	}


