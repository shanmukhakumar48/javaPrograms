public class PalindromNumber {

	public static void main(String[] args) {

//		int n=456,r,revised=0;
//		
//		int original=n;
//		
//		while(n!=0) {
//		r=n%10;
//		revised=revised*10+r;
//		n=n/10;
//		}
	    int num=454,r,revisedNum=0;
		
	    int originalNumber=num;
		
		while(num!=0) {
			
			r=num%10;
			revisedNum=revisedNum*10+r;
			num=num/10;
		}
		
		if(originalNumber==revisedNum) {
		System.out.println(num+" = number is palindrom");
	}
	else {
		System.out.println(num+" = not a palindrom");
	}

}
}
