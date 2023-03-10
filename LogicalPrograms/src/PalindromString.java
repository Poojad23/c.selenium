
public class PalindromString {
	public static void main(String[] args) {
		String str="MADAM";// enuP
		System.out.println("Current string is "+str);
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		if(str.equals(revStr)) {
			System.out.println("Current string is palindrom ");
		}
		else {
			System.out.println("Current string is  not palindrom ");
		}
	}
}
