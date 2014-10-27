import java.security.acl.LastOwnerException;


public class StringRecursiveReversal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
	}

	public String reverseString(String input) {
		String output="";
		if (input.length()==1)
				return input;
		else
		output += input.charAt(input.length()-1)
				+reverseString(input.substring(0, input.length()-1));
		return output;
	}

}
