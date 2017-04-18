
public class main 
{
	
	public static int[] generateList(int n)
	{
		int[] list = new int[n];
		for(int i = 0; i < n; i++)//iterates through list
		{
			list[i] = (int)(10*Math.random());//generates 0-9
		}
		return list;
	}
	
	//if a is > b, return true and switch
	public static boolean isLarger(int a, int b) 
	{
		//a is k-1, b is k 
		if(a>b)
		return true;
		else
		return false;
	}
	
	public static int[] sort(int[] returner)
	{
		int temp;
		int sortingBubble = returner.length;
		//goes through entire list, shortens by 1 every iteration
		for(int i = sortingBubble;i>0;i--)
		{
			//loops through list comparing k and k-1
			for(int k = 1; k<returner.length; k++)
			{
				//switching logic
				if(isLarger(k-1,k))
				{
					temp = returner[k-1];
					returner[k-1] = returner[k];
					returner[k] = temp;
				}
			}
		}	
		return returner;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Bubble Sort 1.0\n");
		int[] list = new int[10];
		list = generateList(10);
		
		for(int i = 0; i < 10; i++)
		{
			if(i==9)
			{
				System.out.print(list[i]+"\n");
			}
			else
			System.out.print(list[i] + ", ");
		}
		
		System.out.println("\n\tSorted list:\n");
		
		sort(list);
		
		for(int i = 0; i < 10; i++)
		{
			if(i==9)
			{
				System.out.print(list[i]+"\n");
			}
			else
			System.out.print(list[i] + ", ");
		}
		
	}
}
