/*

Write a code to get the input in the given format and print the output in the given format.

Input Description:
==================
A single line contains three float values separated by space.

Output Description:
===================
Print the float value separated by line.

Sample Input :
==============
2.3 4.5 7.8

Sample Output :
===============
2.3
4.5
7.8

*/
import java.util.Scanner;
class Basic_8 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		double a=sa.nextDouble();
		double b=sa.nextDouble();
		double c=sa.nextDouble();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
