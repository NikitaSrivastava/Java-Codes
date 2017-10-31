

public class Selsort extends MySort{
	
	protected void sort()
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
					index=j;
			}
			swap(a,i,index);
		}
	}
	
	public void print()
	{
		System.out.println("Selection ");
		super.print();
	}
	public Selsort(int []a)
	{
		super.a=a;
	}
}