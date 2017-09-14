package Assignment_2;																											    // package declaration

import java.util.Arrays;																									// This will import the Arrary class
import java.util.Scanner;																									// This will import the Scanner class
public class TestDemo {																										// Proper naming conventions is used for Class Declaration
/**
 * • Write a program TestDemo.java, which accepts the number as argument and print “You 
 *   Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.
 * • It should print “You Have Entered Positive Value” if the value is greater than 0 along with the ASCII value.
 * • It should print “You Have Entered Negative Value” if the value is less than 0 along with the ASCII value.
 *   All the comments in the program will be placed on the Right-Hand-Side.
 *   @author Sahil Khurana <sahilkhurana369@gmail.com>
 */					  
	public static void main(String[] args) {																				// Main methods Starts
		Scanner input = new Scanner(System.in);																				// Initialize the scanner to get input from User	
try {																														// Try Block Started
	    System.out.print("Enter a number: ");																				// This will print out the argument and ends the line
	    int number = input.nextInt();																						// Read input integer number from the User
	    char digit = (char) number;																							// Casting integer number to char in stored in char variable digit
	    if( number == 0)                                                                                                    // If loop expression to assign the number variable value to zero
	    	{ System.out.println("You Have Entered Zero"); 																	// This will print out the argument in the next line
	    	String text1 = Integer.toString(number);																		// '0', is called the NULL character, whose ASCII value is zero. This is NOT the same character as the printable digit character, '0', whose ASCII value is 48.
	    	byte[] bytes1 = text1.getBytes("US-ASCII");																		// To find the value of String we have to convert string into US-ASCII byte Array 
	    	System.out.print ("The ASCII representation of " + number + " is "); System.out.print(Arrays.toString(bytes1)); // This will print out the argument at the end of the line and second print statement to convert Array in to string to show the output to the user
	        }																												// If loop closed
	    else if (number > 0)																								// nested else if loop expression, will execute when number is greater then zero ie number should be positive
	    	{ System.out.println("You Have Entered Positive Value"); 														// This will print out the argument in the next line
	    	  System.out.println("The ASCII representation of " + number + " is " + digit + "");							// Convert the Positive Number into ASCII
	        }																												// nested else if loop closed
	    else 																												// else loop started, when number is not greater then zero ie when number is negative number
	       { System.out.println("You Have Entered Negative Value"); 														// This will print out the argument in the next line
	      	String text = Integer.toString(number);																			// As there are no negative number representation in ASCII. So we have to convert negative number in to string
	      	byte[] bytes = text.getBytes("US-ASCII");																		// To find the value of String we have to convert string into US-ASCII byte Array 
	      	System.out.print ("The ASCII representation of " + number + " is "); System.out.print(Arrays.toString(bytes));	// This will print out the argument at the end of the line and second print statement to convert Array in to string to show the output to the user
	       }																												// else loop Closed
	} catch (java.io.UnsupportedEncodingException e) {																		// catch statement started, as ASCII does not support -ve number so we have to catch the error by using UnsupportedEncodingException
      e.printStackTrace();}																									// method printStackTrace() will print a stack trace for this object on the error output stream that is the value of the field System.err.
	input.close();																											// Scanner class object input closed
	}																														// Main methods Closed
}																															// class TestDemo closed	
