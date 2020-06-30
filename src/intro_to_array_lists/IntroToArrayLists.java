package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	
	public static void main(String[] args) {
		//1. Create an array list of Strings
		    ArrayList<String> strings = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		     
		//2. Add five Strings to your list
		        for (int i = 0; i <= 5; i++) {
					strings.add("hi" + i);
					if(i%4 == 0) {
						strings.set(i, strings.get(i)+ "e");
					}
				}
		//3. Print all the Strings using a standard for-loop
		      for (int i = 0; i < strings.size(); i++) {
				System.out.println(strings);
			}
		//4. Print all the Strings using a for-each loop
		   for  (String eachString: strings ) {
			   System.out.println(eachString);
			
		}
		//5. Print only the even numbered elements in the list.
		   System.out.println("even");
		        for (int i = 0; i < strings.size(); i++) {
					if(i%2 == 0) {
						System.out.println(strings.get(i));
					}
				}
		//6. Print all the Strings in reverse order.
		        System.out.println("reverse");
		        for (int i = strings.size() - 1; i >= 0 ; i--) {
		        	
		        	System.out.println(strings.get(i));
		        	
		        }
		//7. Print only the Strings that have the letter 'e' in them.
		        for (int i = 0; i < strings.size(); i++) {
		        	String str = strings.get(i);
					if(str.contains("e")) {
						System.out.println(str);
					}
					
					
				}

	}
}
