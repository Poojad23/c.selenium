
public class WordReverse {
	public static void main(String[] args) {
	String str = "pooja amit dalvi";
	String [] words= str.split(" ");
	String revstr ="";
	for (int i = 0; i < words.length; i++) {
	   
	    	revstr = " " + words[i] + revstr;
	}
	System.out.print(revstr);
}
}
