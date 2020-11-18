/*

Write a code to get the input in the given format and print the output in the given format

Input Description:
==================
Three integers are given in line by line.

Output Description:
===================
Print the integers in a single line separate by space.

Sample Input :
==============
2
4
5

Sample Output :
===============
2 4 5

*/
import java.util.Scanner;
class Basic_5 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int b=sa.nextInt();
		int c=sa.nextInt();
		System.out.print(a+" "+b+" "+c);
	}
}
