package Practice;
import java.util.Arrays;
public class BubbleOptimized {
	
	
		public static void main(String args[])
		{
	int arr[]= {1,2,3};
	int n=arr.length;
	System.out.println("Before sorting"+"\n"+Arrays.toString(arr));
	boolean swapped;
	for(int i=0;i<n-1;i++)
	{
		swapped=false;
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped=true;
			}
		}
		if(swapped==false)
		{
			break;
		}
	}
	System.out.println("After sorting");
	System.out.println(Arrays.toString(arr));
		}
		
	}


