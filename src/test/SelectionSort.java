package test;

public class SelectionSort {
	public static void main(String... args)
	{
	
	int[] a={23,45,2,78,12,45,23,14};
	
	for (int i=0;i<a.length;i++)
	{
		int min =i;
		for (int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[i])
			{
				min=j;
			}
		}
		int temp=a[min];
		a[min]=a[i];
		a[i]=temp;
		
		System.out.println(a[i]);
	}
		
	}

}
