/*

Write a code to get the input in the given format and print the output in the given format.

Input Description:
==================
First-line indicates two integers which are the size of array and 'K' value. Second-line indicates an integer contains elements of an array.

Output Description:
===================
Print the taken input in the same format.

Sample Input :
===============
5 3
1 2 3 4 5

Sample Output :
===============
5 3
1 2 3 4 5

*/
import java.util.Scanner;
class Basic_3 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int k=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		System.out.println(n+" "+k);
		for(int i=0;i<a.length;i++){
			if(a.length-1==i){
				System.out.print(a[i]);
			}
			else{
				System.out.print(a[i]+" ");
			}
		}
	}
}
