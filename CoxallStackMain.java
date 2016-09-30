/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program pushes something into the stack and pops it out
 *
 ****************************************************************************/

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		MCoxallStack aStack = new MCoxallStack();
		
		String stackString;
		String returnedString;
		for (;;) {
		System.out.println("Enter the string");
		stackString = read.next();
		
		aStack.push(stackString);
		System.out.println("The top string was: " + aStack.pop());
		}
	}

}
