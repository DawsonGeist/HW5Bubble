
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
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Bubble Sort 1.0");
		int[] list = new int[10];
		list = generateList(10);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(list[i] + ", ");
		}
		
	}
}
