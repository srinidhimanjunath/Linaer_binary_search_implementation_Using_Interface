import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


interface i1
{
	public void search();
}


 class s1 implements i1{
	int ch,pos=0,i=0;
	Random rnd = new Random();
	int arr[] = new int[10];
	public void getChoice()
	{
		Scanner key = new Scanner(System.in);
		System.out.println("1)Linear Search 2)Binary Search");
		ch = Integer.parseInt(key.nextLine());
		for(int i=0;i<10;i++)
		{
			arr[i] = 1+rnd.nextInt(50);
		}
	}
	@Override
	public void search() {
		if(ch==1)
		{
			 Linarsearch();
		}
		else if(ch==2)
		{
			 BinarySearch();
		}
		
	}
	public void  Linarsearch(){
		int se,count=1;
		Scanner obj = new Scanner(System.in);
		for(int j=0;j<10;j++)
		{
			System.out.println(arr[j]);
		}
		
		System.out.println("Enter the element you want to search within the range of 50");
		se= Integer.parseInt(obj.nextLine());
		
		for(int l=0;l<10;l++ )
		{
			if(arr[l] == se)
			{
				System.out.println("Element found at pos :" + l);
				count++;
			}
			else if(count > 10)
			{
				System.out.println("Element not found");
			}
		}
		
	}
	public void BinarySearch()
	 {
		int high,low,mid,key;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int j=0;j<arr.length;j++)
		{
			a.add(arr[j]);
			
		}
		Collections.sort(a); 
		for(int j=0;j<arr.length-1;j++)
		{
			arr[j] = a.get(j);
			
		}
		for(int j=0;j<10;j++)
		{
			System.out.println(arr[j]);
		}
		Scanner key1 = new Scanner(System.in);
		System.out.println("Enter the element you wanrt ot search with in the range 50");
		key = Integer.parseInt(key1.nextLine());
		low=0;
		high = arr.length-1;
		mid = (low+high)/2;
		while(low<=high)
		{
			if(arr[mid]<key)
			{
				low = mid+1;
			}
			if(arr[mid] == key)
			{
				System.out.println("Element found at pos "+(mid+1));
				break;
			}
			else if(arr[mid] > key)
			{
				high = mid-1;
			}
			mid = (low+high)/2;
		}
		if(low>high)
			System.out.println("Element no0t found");
		 
	 }
}

public class eg {
	public static void main(String args[])
	{
		s1 obj1 = new s1();
		obj1.getChoice();
		obj1.search();
		
		
	}

}
