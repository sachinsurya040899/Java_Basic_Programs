/*

Write a code to get the input in the given format and print the output in the given format.

Input Description:
==================
A single line contains a string.

Output Description:
===================
Print the characters in a string separated by line.

Sample Input :
==============
guvigeek

Sample Output :
===============
g
u
v
i
g
e
e
k

*/
import java.util.Scanner;
class Basic_9 
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
				System.out.println(s[i].charAt(0));
			}
		}
	}
}
