import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		int n;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		n=sc.nextInt();
//		--------------------
//		if(n%2==0)
//        result=22L;
//		
//		else                                using if else methods
//			result=55L;
//		System.out.println(result);
//      --------------------------
		result=(n%2==0)?"even": "odd";     //using ternary operators
		System.out.print(result);
	}
}