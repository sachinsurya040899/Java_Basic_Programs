/*

Write a code to get an integer N and print the sum of  values from 1 to N.

Input Description:
==================
A single line contains an integer N.

Output Description:
===================
Print the sum of values from 1 to N.

Sample Input :
==============
10

Sample Output :
===============
55

*/
import java.util.Scanner;
class Basic_13 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.print(sum);
	}
}
