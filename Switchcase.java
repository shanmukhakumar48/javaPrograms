import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int day;
		System.out.println("enter the number for days = ");
		day=sc.nextInt();
		switch(day) {
		
		case 1:System.out.println("monday");
		       break;
		case 2:System.out.println("tuesday");
	       break;
		case 3:System.out.println("Wednesday");
	       break;
		case 4:System.out.println("Thursday");
	       break;
		case 5:System.out.println("Friday");
	       break;
		case 6:System.out.println("Saturday");
	       break;
		case 7:System.out.println("Saturday");
	       break;
	      
		default:System.out.println("error");

		   
		
		}
		
	}

}
