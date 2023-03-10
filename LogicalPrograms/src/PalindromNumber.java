
public class PalindromNumber {
	public static void main(String[] args) {
		int num1=131;  
		int num=num1;
		System.out.println("The Given number is "+num);
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10; 
			num=num/10;			
		}
		if(num1==rev) {
			System.out.println("The Given number is  Palindrom ");
		}
		else {
			System.out.println("The Given number is not Palindrom ");
		}

	}
}
