package duplicateElemtOperations;

import java.util.Scanner;

public class Remove_Most_Repeated 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements one by one");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		
		int count = 0;
		int maxCount = 0;
		int mostRepeated = arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[j] == arr[i])
					count++;
			}
			if(count>maxCount)
			{
				maxCount = count;
				mostRepeated = arr[i];
			}
		}
		System.out.println("Most Repeated Value is:-" + mostRepeated);
		s.close();
	}
}
