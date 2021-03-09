/* =======================================================================
 * Text:  Blue Pelican Java                       Author:  sleepyFuji
 * Version:  001                                  Date:  Feb 13, 2019
 *
 * Purpose:  Answers to questions 14-19 on lesson 9
 *
 * Course:   Computer Science 201                Teacher:  [redacted]
 * School:   [redacted]
 * Language: Java J2SE 6.0                       Target OS: Java Virtual Machine
 * System:   Intel Celeron 3GHz, Windows XP      IDE: Eclipse 3.4
 * ======================================================================= */

import java.util.Scanner;

public class Lesson9{
  public static void main(String[]args){
    //Question 14
	String s1 = "school BUS";
	if (s1.equals("school bus"))
		System.out.println("Equal");
	else
		System.out.println("Not equal");
    
    //Question 15
String s2 = "school BUS";
	if (s2.equalsIgnoreCase("school bus"))
		System.out.println("Equal");
	else
		System.out.println("Not equal");
    
    //Question 16
    int j = 19, m = 200;
	if (j==18)
		m++;
		j++;  
	System.out.println(m);
	System.out.println(j);
    
    //Question 17
    boolean b = ( g  != 34);
	System.out.println(b);
    
    //Question 18
    boolean b1 = ( k % 2 == 0);
	System.out.println(b1);
    
    //Question 19
    Scanner Reader = new Scanner(System.in);
	System.out.print("Enter your password: ");
   	String s = Reader.nextLine();
		if (s.equals("Xray"))
			System.out.println("Password entered successfully.");
		else
			System.out.println("Incorrect password.");
  }
}
