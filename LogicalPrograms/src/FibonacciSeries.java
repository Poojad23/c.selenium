
public class FibonacciSeries {
	public static void main(String[] args) {
		/*	0	 1     1    2      3       5      8  13  21
		    n1   n2   sum
		         n1    n2   sum
		                n1   n2    sum
		                     n1     n2    sum
		    */
				int n1=2;
				int n2=4;
				int sum=0;
				System.out.println(" "+n1+" "+n2);
				
				for(int i=0;i<5;i++) {
					sum=n1+n2;
					System.out.print(" "+sum);
					n1=n2;
					n2=sum;
				}
			}
}
