/*

Write a code to get the input in the given format and print the output in the given format

Input Description:
==================
First-line indicates two integers separated by space. 
Second-line indicates three integers separated by space. 
Third-line indicates three integers separated by space

Output Description:
===================
Print the input in the same format.

Sample Input :
==============
2 5
2 5 6
2 4 5

Sample Output :
===============
2 5
2 5 6
2 4 5

*/
import java.util.Scanner;
class Basic_6 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int b=sa.nextInt();
		int p=sa.nextInt();
		int q=sa.nextInt();
		int r=sa.nextInt();
		int n=sa.nextInt();
		int m=sa.nextInt();
		int o=sa.nextInt();
		System.out.println(a+" "+b);
		System.out.println(p+" "+q+" "+r);
		System.out.print(n+" "+m+" "+o);
	}
}
