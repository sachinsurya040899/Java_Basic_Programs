/*

Write a code to get 2 integers A and N. Print the integer A, N times in separate line.

Input Description:
==================
First line contains an integer A. Second line contains an Integer N.

Output Description:
===================
Print the integer A, N times in a separate line.

Sample Input :
==============
2 3

Sample Output :
===============
2
2
2

*/
import java.util.Scanner;
class Basic_11 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int n=sa.nextInt();
		for(int i=0;i<n;i++){
			System.out.println(a);
		}
	}
}
