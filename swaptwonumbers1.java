import java.util.Scanner;

public class swaptwonumbers1 {
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the x = ");
    int x=sc.nextInt();		
    System.out.println("enter the y = ");
    int y=sc.nextInt();	
    
    System.out.println("before Swapping x = "+x);
    System.out.println("before Swapping y = "+y);
int z=x;
    x=y;
    y=z;
    System.out.println("");
System.out.println("After Swapping x ="+x);
System.out.println("After Swapping y ="+y);
}}