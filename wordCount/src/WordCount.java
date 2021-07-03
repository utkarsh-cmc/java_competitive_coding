import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<String, Integer>();
        
		Scanner txtFile=new Scanner(new File("C:\\Users\\hp\\Desktop\\data.txt"));
		while (txtFile.hasNext() ) {
			String word=txtFile.next();
			if(map.containsKey(word)) {
				int count =map.get(word) +1;
				map.put(word, count);
			}
			else {
				map.put(word,1);
			}
		}
		txtFile.close();
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry);
		}
	}

}
