import java.util.Arrays;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String str="welcome to java programming";
		
		String[] words = str.split(" ");
		
		String revStr="";
		String capitalizeWord=revStr;
		/*for(String word:words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			revStr=revStr+revWord+" ";
		}*/
		//output:emoclew ot avaj gnimmargorp 
		
		 
	      for (int i = 0; i < words.length; i++) {
	    	  
	            if (i == words.length - 1)
	            	
	            	revStr = words[i] + revStr;
	            
	            else
	            	revStr = " " + words[i] + revStr;
	           
	        }
	      for(String w:words){  
	          String first=w.substring(0,1);  
	          String afterfirst=w.substring(1);  
	          capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	          System.out.println(capitalizeWord); 
	      }  
	        
	    
		System.out.println(revStr); //programming java to welcome
		
	}
}
