import java.util.*;
public class heap {
	static int[] heapify(int arr[], int i)
	{
		while((i>=0)&&(arr[i]>arr[(i-1)/2]))
		{
			int temp= arr[i];
			arr[i]=arr[(i-1)/2];
			arr[(i-1)/2]=temp;
			i=(i-1)/2;
		}
		return arr;
	}
	static int[] makemaxheap(int arr[])
	{
		int i=0;
		int arr3[]= new int[arr.length];
	    for(i=0;i<arr.length;i++)
	    {
	    	arr3[i]=arr[i];
	    	arr3=heapify(arr3,i);
	    }
		return arr3;
	}
	static int[] heapifymax(int arr[], int j)
	{
		int count=0;
		int bigger=0;
		while(count<=j)
		{
			if((count*2+1<=j)&&(count*2+2<=j))
			{
			if(arr[count*2+1]>arr[count*2+2])
			{
				bigger=count*2+1;
			}
			else
			{
				bigger=count*2+2;
			}
			}
			else
			{
				if(count*2+1<=j)
				{
					bigger= count*2+1;
				}
				else
				{
					break;
				}
			}
			if(arr[count]<arr[bigger])
			{
				int temp=arr[bigger];
				arr[bigger]=arr[count];
				arr[count]=temp;
				count=bigger;
			//	System.out.println(count);
			}
			else
			{
				break;
			}
		}
		return arr;
	}
	static int[] heapsort(int arr[])
	{
		int l= arr.length-1;
		//int last= arr[l];
		//int first= arr[0];
		int i=0;
		for(i=0;i<arr.length;i++)
		{
		int temp= arr[0];
		arr[0]= arr[l];
		arr[l]=temp;
		arr=heapifymax(arr,l-1);
		l=l-1;
		}
		return arr;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		int i=0;
		for(i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		int arr2[]= makemaxheap(arr);
		for(i=0;i<arr2.length;i++)
		{
		  System.out.println(arr2[i]);
		}
		System.out.println("------------------");
		int arr3[]= heapsort(arr2);
		for(i=0;i<arr2.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}

}
