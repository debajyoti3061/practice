import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        DuplicateCharsInString dcs = new DuplicateCharsInString();
	        dcs.findDuplicateChars("Java2Novice");
	}

	public void findDuplicateChars(String input) {
		// TODO Auto-generated method stub
		char[] ch = input.toCharArray();
		Map<Character,Integer> mp = new HashMap<Character, Integer>();
		
		for(Character c:ch){
			if (mp.containsKey(c))
				mp.put(c, mp.get(c)+1);
			else mp.put(c, 1);
			
		}
		System.out.println(mp);
		
		Set<Character> keys = mp.keySet();
		
	}

}
