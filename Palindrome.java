
public class Palindrome {
	public static String Palindrome(String input) {
		//turn the string input into a char array
		String newString = "";
		//turn the string input into a char array
		char[] list = input.toCharArray();
		int end = list.length-1;
		for (int i = 0; i<list.length; i++) {
			newString += list[end];
			end--;
		}
		return newString;
	}
	
	public static void main(String[] args) {
		System.out.println(Palindrome("Happy"));
		String happy = "Happy";
		char[] happyList = happy.toCharArray();
		System.out.println(happyList[4]);
		System.out.println(happy.length());
		
	}

}
