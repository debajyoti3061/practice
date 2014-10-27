package practice;

import org.testng.annotations.Test;

public class NumberReverse {

	@Test
	public static void number() {
		// TODO Auto-generated method stub
		NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(17868));
	}

	public int reverseNumber(int i) {
		// TODO Auto-generated method stub
		int rev = 0;
		while (i!=0){
		 rev = rev*10 + i%10;
		 i =i/10;
		
		}
		return rev;
	}

}
