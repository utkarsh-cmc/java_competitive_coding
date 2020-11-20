package stringPractice;
//import java.util.*;

public class AnagramString {

	public static void main(String[] args) {
		//using ascii value array count
		String a = "aab";
		String b = "aba";
		
		boolean isAnagram = true;
		
		int al[]=new int[256];
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
        
		for(int i=0;i<256;i++) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("The String is Anagram...");
		}
		else
			System.out.println("The String is not Anagram...");
	}

}
