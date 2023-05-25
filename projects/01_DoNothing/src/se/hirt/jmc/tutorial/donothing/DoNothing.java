/*
 * Copyright (c) 2018, Marcus Hirt
 * 
 * jmc-tutorial is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jmc-tutorial is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jmc-tutorial. If not, see <http://www.gnu.org/licenses/>.
 */
package se.hirt.jmc.tutorial.donothing;

//import java.io.IOException;
import java.io.*;



/**
 * Program that doesn't do much.
 */
public class DoNothing {
	public static void main(String[] args) throws IOException {
		System.out.println("Press <enter> to quit! Otherwise, <enter> an alphanumeric string:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("You entered: " + str);				
		System.out.println("The length of the string is: " + countStringLen(str));				
		System.out.println("Hello copilot! Testing connection to GitHub 2!");				
		System.out.println("The reverse of the string is: " + reverseString(str));
	}

	/* Create a method named countStringLen to count the length of the string entered in main.  Call the method from main */
	public static int countStringLen(String str) {
		return str.length();
	}

	/* Create a method to reverse string  - created by copilot*/
	public static String reverseString(String str) {		
		String reverse = "";
		int len = countStringLen(str) - 1;
		for (int i = len; i >= 0; i--)	
			reverse = reverse + str.charAt(i);		
		return reverse;
	}
	


}
