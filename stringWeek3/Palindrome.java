package stringWeek3;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="malayalam";
		String revvalue="";
		int length = value.length();
		
		for(int i=(length-1);i>=0;i--) {
			revvalue=revvalue+value.charAt(i);
			}
		System.out.println("***********************");
		System.out.println("The value is   "+revvalue);
		
		if(value.equals(revvalue))
			System.out.println(value+  "  is a palindrome, as its reverse value is   "+revvalue);
		else 
			System.out.println(value+"   is a not palindrome, as its reverse value is  "+revvalue);
		}
}
