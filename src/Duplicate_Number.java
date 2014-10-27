import java.util.ArrayList;
import java.util.List;


public class Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<Integer>();
		for (int i=1; i<10;i++)
		{
			a.add(i);
			
		}
		a.add(7);
		System.out.println(a);
		Duplicate_Number d = new Duplicate_Number();
		int dup =find(a);
		System.out.println(dup); 

}
	
	public static int find(List<Integer> a){
		int high = a.size()-1;
		int count = high*(high+1)/2;
		
		int total = sum(a);
		int dup = total - count;
				return dup;
	}
	
	public static int sum(List<Integer> a){
		int sum = 0;
		
		for (Integer n:a){
			sum += n;
			
		}
		return sum;
		
	}
}
