//Array Traversal

import java.util.*;
public class ArrayTraversal
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []arr=new int[50];
	int i;
	System.out.println("Array size");
	int n=sc.nextInt();
	System.out.println("Elements");
	for(i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	System.out.println("Elements are :");
	for(i=0;i<n;i++)
	{
	 System.out.print(arr[i]+" ");
	}
	}
}

