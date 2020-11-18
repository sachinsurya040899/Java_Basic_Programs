/*

Write a code to get the input in the given format and print the output in the given format

Input Description:
==================
First-line indicates two integers separated by space. Second-line indicates
two integers separated by space. Third-line indicates two integers separated by space.

Output Description:
===================
Print the input in the same format.

Sample Input :
==============
2 4
2 4
2 4

Sample Output :
===============
2 4
2 4
2 4

*/
import java.util.Scanner;
class Basic_4 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int b=sa.nextInt();
		int x=sa.nextInt();
		int y=sa.nextInt();
		int p=sa.nextInt();
		int q=sa.nextInt();
		System.out.println(a+" "+b);
		System.out.println(x+" "+y);
		System.out.print(p+" "+q);
	}
}
