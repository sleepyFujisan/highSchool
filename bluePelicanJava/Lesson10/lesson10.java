/* =======================================================================
 * Text:  Blue Pelican Java                       Author:  sleepyFuji
 * Version:  001                                  Date:  Feb 21, 2019
 *
 * Purpose:  Answers to questions 1-9
 *
 * Course:   Computer Science 201                Teacher:  [redacted]
 * School:   [redacted]
 * Language: Java J2SE 6.0                       Target OS: Java Virtual Machine
 * System:   Intel Celeron 3GHz, Windows XP      IDE: Eclipse 3.4
 * ======================================================================= */

public class lesson10{
// Question 1: The two types of permissible data is "int" and "char".
  
			public static void main(String[]args){
	    int x = 3, p = 5, y = -8;
		  switch (x)
		  {
		  case 2: p++;
		  case 3: 
	  	case 4: y+=(--p);
		  break;
	  	case 5: y+=(p++);
	  	}
			System.out.println(y);		//OUTPUT:-4
}
*/
// Question 3: CODE
/*
			public static void main(String[]args){
		int G, g, M, m;
		switch (myChar)
		{
			case:"G";
		case:"g": y++;
	break:
			case: "M";
		case: "m" : y--;
	break:
			default: y +=100;
		}
*/
// Question 4: CODE AND OUTPUT
/*
			public static void main(String[]args){
		int z = 2, q = 0;
		switch(z)
		{
		case 1:
				q++;
		case 2:
				q++;
		case 3:
				q++;
		case 4:
				q++;
		default:
				q++;
		}
			System.out.println(--q);	//OUTPUT: 3
			}
*/
//Question 5: CODE
/*
			public static void main(String[]args){
		char ch = z;
			}
*/
// Question 6: CODE AND OUTPUT
/*
			public static void main(String[]args){
		int x = 10, y = 12;
			System.out.println("The sum is " + x + y);
			System.out.println("The sum is " + (x + y));
						//OUTPUT: The sum is 1012
						//	    The sum is 22

			}
*/
//Question 7: CODE
/*
			public static void main(String[]args){
		int speed = 0;
		switch(speed)
		{
		case 75:
			System.out.println("Exceeding speed limit.");
			break;
		case 70:
		case 69:
			System.out.println("Getting close.");
			break;
		case 65:
			System.out.println("Cruising.");
			break;
		default:
			System.out.println("Very slow.");
			}}
*/
// Question 8: ANSWER
// The default part of a switch is optional.
	
// Question 9: CODE
/*
			public static void main(String[]args){
			String s = "X";
			char chr = 'X';
			}
*/
}

