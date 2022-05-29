//deletion by position
// code by Aaditya Mishra


import java.util.*;
public class DelAtPos
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
    System.out.println("Enter the index to  be deleted: ");
    int pos=sc.nextInt();
    if(pos>=n+1)
    {
        System.out.println("Invalid pos ");
    }
    else
    {
        for(i=pos-1;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
    }
    
    for(i=0;i<n-1;i++)
    {
        System.out.println(arr[i] + " ");
    }
 
	}
}
