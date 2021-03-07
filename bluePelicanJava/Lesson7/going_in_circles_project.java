/* =======================================================================
 * Text:  Blue Pelican Java                       Author:  sleepyFuji
 * Version:  001                                  Date:  Feb 12, 2019
 *
 * Purpose:  This program takes user input for circle area, and outputs the radius
 *
 * Course:   Computer Science 201                Teacher:  [redacted]
 * School:   [redacted]
 * Language: Java J2SE 6.0                       Target OS: Java Virtual Machine
 * System:   Intel Celeron 3GHz, Windows XP      IDE: Eclipse 3.4
 * ======================================================================= */

import java.util.Scanner;

public class going_in_circles_project{
  public static void main(String[]args){
    Scanner reader = new Scanner(System.in);
    System.out.println("What is the area?");
    double s = reader.nextDouble();
    double r = Math.sqrt(s/Math.PI);
    System.out.println("The radius of your circle is " + r);
  }
}

//Example Output:
// What is the area? 4.5
// The radius of your circle is 1.196826841204298
