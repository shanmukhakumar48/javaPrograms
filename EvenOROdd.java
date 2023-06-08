import java.util.Scanner;

public class EvenOROdd {
	public static void main(String[] args) {
		Scanner xdghozsh = new Scanner(System.in);
		
		System.out.println("enter the number");
		int x=xdghozsh.nextInt();
		
		String output=(x%2==0)?"the number is EVEN Number":"the number is ODD Number";
		System.out.println(output);
	}

}
