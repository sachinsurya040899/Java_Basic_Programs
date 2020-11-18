/*

Write a code to get the input in the given format and print the output in the given format

Input Description:
==================
A single line contains a string.

Output Description:
===================
Print the characters in a string separated by space.

Sample Input :
==============
guvi

Sample Output :
===============
g u v i

*/
import java.util.Scanner;
class Basic_7 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split("");
		for(int i=0;i<s.length;i++){
			if(i==s.length-1){
				System.out.print(s[i].charAt(0));
			}
			else{
				System.out.print(s[i].charAt(0)+" ");
			}
		}
	}
}
