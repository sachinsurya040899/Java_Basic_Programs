/*

Write a code get an integer number as input and print the odd and even digits of the number separately.

Input Description:
==================
A single line containing an integer.

Output Description:
===================
Print the even and odd integers of the integer in a separate line.

Sample Input :
==============
1234

Sample Output :
===============
2 4
1 3

Input:
======
233342

Expected Output:
================
2 2 4

Input:
======
535225324

Expected Output:
================
2 2 2 4
3 3 5 5 5

*/
import java.util.Scanner;
class Basic_14 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String n=sa.next();
		String s[]=n.split("");
		int len=s.length;
		int a[]=new int[len];
		int even[]=new int[len];
		int odd[]=new int[len];
		for(int i=0;i<s.length;i++){
			a[i]=Integer.valueOf(s[i]);
		}
		int in=0;
		int in1=0;
		for(int i=0;i<len;i++){
			even[i]=-1;
			odd[i]=-1;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				even[in++]=a[i];
			}
			else{
				odd[in1++]=a[i];
			}
		}
		for(int i=0;i<even.length;i++){
			if(even[i]!=-1 && even[i+1]==-1){
				System.out.print(even[i]);
			}
			else if(even[i]!=-1){
				for(int j=i+1;j<even.length;j++){
					if(even[i]>even[j] && even[j]!=-1){
						int temp=even[i];
						even[i]=even[j];
						even[j]=temp;
					}
				}
				System.out.print(even[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<odd.length;i++){
			if(odd[i]!=-1 && odd[i+1]==-1){
				System.out.print(odd[i]);
			}
			else if(odd[i]!=-1){
				for(int j=i+1;j<odd.length;j++){
					if(odd[i]>odd[j] && odd[j]!=-1){
						int temp=odd[i];
						odd[i]=odd[j];
						odd[j]=temp;
					}
				}
				System.out.print(odd[i]+" ");
			}
		}
	}
}