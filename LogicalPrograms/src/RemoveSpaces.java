
public class RemoveSpaces {
	public static void main(String[] args) {
		String str="Welcome  to  java  Programming";
		
		System.out.println("original string"+str);
		str=str.replaceAll(" ","");
		System.out.println("Modified string"+str);
	}
}
