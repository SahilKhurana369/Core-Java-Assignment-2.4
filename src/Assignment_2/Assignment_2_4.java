/**
 * 
 */
package Assignment_2;																			// package declaration

/**
 * • A student has A grade if marks are more than 70, B grade if marks are between 61 and 70 
 *   and C grade if marks are less than 61 ) Write a program to print the grade for the given marks.
 * • Take three subjects like PCM and calculate the average and the above grading system will work on the avg.
 * • Take marks of the subject from the user.
 *   All the comments in the program will be placed on the Right-Hand-Side.
 *   @author Sahil Khurana <sahilkhurana369@gmail.com>
 * 	 I have tried to get the same result with two different approaches to verify the Results 	
 */
import java.util.Scanner;																		// This will import the Scanner class																							
public class Assignment_2_4 {																	// Proper naming conventions is used for Class Declaration
	public static void main(String[] args) {													// Main methods Starts
		float sum=0,avg;																		// float (Variable) sum and avg Declared and assigned a value equal to zero to sum
        Scanner sc = new Scanner( System.in ); 													// Initialize the scanner to get input from User
        System.out.print("Enter your first Student name: ");									// This will print out the argument and ends the line
        String StudentName1 = sc.nextLine();													// Read String input StudentName1 from the User
        System.out.print("Enter Physics Marks   : ");											// This will print out the argument and ends the line
        float Physics = sc.nextFloat();															// Read float input Physics from the User
        System.out.print("Enter Chemistry Marks : ");											// This will print out the argument and ends the line
        float Chemistry = sc.nextFloat();														// Read float input Chemistry from the User
        System.out.print("Enter Maths Marks     : ");											// This will print out the argument and ends the line
        float Maths = sc.nextFloat();															// Read float input Math from the User
        sum = Physics+Chemistry+Maths;															// Adding the value of Physics,Chemistry and Maths floating variables and stored them in float variable sum 
        avg= sum/3;																				// float variable avg will store the value of sum divided by 3
        System.out.print(StudentName1+"'s Average Marks is "+ avg +" and Grade is ");			// This will print out the argument and ends the line
        	if(avg>70)																			// if loop expression, to check the condition if avg is greater the 70
        	{System.out.print("A");}															// then print GRADE A
        	else if(avg>=61 && avg<=70)													    	// nested else if loop expression, to check the condition if avg between 61 and 70
        	{System.out.print("B");}															// then print GRADE B
        	else if (avg<61)															    	// nested else if loop expression, to check the condition if avg less then 61
        	{System.out.print("C"); }															// then print GRADE C
				
       	System.out.println();																	// This will move the cursor to next line
        System.out.println();																	// This will move the cursor to next line
        System.out.print("Enter your Second Student name: ");									// This will print out the argument and ends the line
        Scanner sc2 = new Scanner( System.in );													// Initialize the scanner to get input from User
        String StudentName2 = sc2.nextLine();													// Read String input StudentName2 from the User
        int mark[] = new int[3];																// Mark Array is Initialize where Mark0,Mark1 and Mark2 are integers   
        int i;float sum2=0,avg2;	    														// integer i variable and float (Variable) sum2 and assigned a value equal to zero to sum
        System.out.println("Enter Marks Obtained in 3 Subjects Physic, Chemistry & Maths : ");	// This will print out the argument and ends the line
        	for(i=0; i<3; i++) {																// if loop expression, Initialize integer i equal zero, and the loop will execute till i is less ten three, till i is less then 3, increment by one.            
        	mark[i] = sc2.nextInt();														 	// Mark0,Mark1 and Mark2 input from user
            sum2 = sum2 + mark[i];}																// Adding the value of Mark0,Mark1 and Mark2 variables and stored them in float variable sum2 
        	avg2 = sum2/3;																		// float variable avg will store the value of sum divided by 3
        System.out.print(StudentName2+"'s Average Marks is "+ avg2 +" and Grade is ");			// This will print out the argument and ends the line
        if(avg2>70)																				// if loop expression, to check the condition if avg is greater the 70
        {System.out.print("A");}																// then print GRADE A
        else if(avg2>=61 && avg2<=70)															// nested else if loop expression, to check the condition if avg between 61 and 70
        {System.out.print("B");}																// then print GRADE B
        else if (avg2<61)																		// nested else if loop expression, to check the condition if avg less then 61
        {System.out.print("C"); }																// then print GRADE C
        sc2.close();																			// object "sc2" of the scanner class closed 
	}																							// Main methods Closed
}																								// class Assignment_2_4 closed			
