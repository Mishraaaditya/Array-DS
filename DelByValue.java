// deletion by value
// code by : Aaditya Mishra



import java.util.*;
public class DelByValue
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []arr=new int[50];
	int i;
	int found=0;
	int position=0;
	
	System.out.println("Array size");
	int n=sc.nextInt();
	System.out.println("Elements");
	for(i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
    System.out.println("Enter the value to  be deleted: ");
    int value=sc.nextInt();
    for(i=0;i<n;i++)
    {
         if(arr[i]==value)
          {
            found=1;
            position=i;
            break;
          }
    }
    if(found==1)
    {
        for(i=position;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
    }
    else
    {
        System.out.println("Element is not in the array ");
    }
    
    for(i=0;i<n-1;i++)
    {
        System.out.println(arr[i] + " ");
    }
	}
}
