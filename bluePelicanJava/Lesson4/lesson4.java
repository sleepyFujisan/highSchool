/* =======================================================================
 * Text:  Blue Pelican Java                       Author:  sleepyFuji
 * Version:  001                                  Date:  Feb 12, 2019
 *
 * Purpose:  These are my answers to the lesson 4 questions: 1, 2, 3, 5, 8, 11, 12, 13
 *
 * Course:   Computer Science 201                Teacher:  [redacted]
 * School:   [redacted]
 * Language: Java J2SE 6.0                       Target OS: Java Virtual Machine
 * System:   Intel Celeron 3GHz, Windows XP      IDE: Eclipse 3.4
 * ======================================================================= */
public class lesson4{
	
	public static void main(String[]args){
		// Problem #1
		int h = 103;
		int p = 5;
		System.out.print("\n");
		System.out.println(++h + p);
		System.out.println(h);
		
		// Problem #2
		int j = 5 ;
		System.out.print("\n");
		System.out.println(++j);
		System.out.println(j++);
		System.out.println(j += 1);
		
		// Problem #3
		double def;
		double f = 1_992.37;
		def = f;
		System.out.print("\n");
		System.out.println(def);
		
		// Problem #5
		int a = 100;
		int b = 200;
		b /= a;
		System.out.print("\n");
		System.out.println(b+1);
		
		// Problem #8
		p = 40;
		int q = 4;
		System.out.print("\n");
		System.out.println(2 + 8 * q / 2 - p);
		
		// Problem #11
		double m = 3.14, b1 = 3.14, f1 = 3.14;
		System.out.print("\n");
		System.out.println(m + b1 + f1);
		
		// Problem #12
		//int x1, y, z;
		
		// Problem #13
		int m1 = 36;
		int j1 = 5;
		m1 = m1 / j1;
		System.out.print("\n");
		System.out.println(m1);
	}	
}
