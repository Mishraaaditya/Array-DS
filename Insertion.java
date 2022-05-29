//insertion at specific position
// code by : aaditya_mishra

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []arr=new int[50];
	int i;
	int num=10;
	System.out.println("Array size");
	int n=sc.nextInt();
	System.out.println("Elements");
	for(i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	System.out.println("Position where to be inserted:");
	int pos=sc.nextInt();
	for(i=n-1;i>=pos-1;i--)
	{
	    arr[i+1]=arr[i];
	}
	arr[pos-1]=num;

	System.out.println("Elements are :");
	for(i=0;i<=n;i++)
	{
	 System.out.print(arr[i]+" ");
	}
	}
}
