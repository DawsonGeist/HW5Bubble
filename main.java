import java.util.*;
public class main 
{
	
	public static ArrayList<Integer> generateList(int n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)//iterates through list
		{
			list.add((int)(10*Math.random()));//generates 0-9
		}
		return list;
	}
	
	
	public static ArrayList<Integer> sort(ArrayList<Integer> n)
	{
		int length = n.size();
		ArrayList<Integer> returner = n;
		int largerNum;
		
		//bubble through list, bubble decreases by one
		for(int k = length; k > 0; k--)
		{
			
			/*
			 * Pulls the "Switching" logic down the list until it 
			 * reaches the end of the "Sort Bubble" (k)
			 */
			
			for(int i = 1; i < k; i++)//Bounded by Sorting Bubble
			{
				/*
				 * returner: a,b,c... 
				 * b = i, a = i-1;
				 * if a > b
				 * "Switch"
				 * returner: b,a,c...
				 */
				//if()
				{
					//implement truth statement
					//sort
				}
			}
			
		}
		
		
		
		return returner;
	}
	
	
	public static void main(String[] args)
	{
	
//		System.out.println("Welcome to Bubble Sort 1.0\n");
//		int[] list = new int[10];
//		list = generateList(10);
//		
//		for(int i = 0; i < 10; i++)
//		{
//			if(i==9)
//			{
//				System.out.print(list[i]+"\n");
//			}
//			else
//			System.out.print(list[i] + ", ");
//		}
//		
//		System.out.println("\n\tSorted list:\n");
//		
//		sort(list);
//		
//		for(int i = 0; i < 10; i++)
//		{
//			if(i==9)
//			{
//				System.out.print(list[i]+"\n");
//			}
//			else
//			System.out.print(list[i] + ", ");
//		}
		
		System.out.println("Testing the switch algorithym");
		ArrayList<Integer> test = new ArrayList<Integer>();
		//print out list
		test.add(5);
		test.add(3);
		for(int i = 0; i<test.size();i++)
		{
			System.out.print(test.get(i) + " ");
		}
		//switch the first two
		int largerNum;
		if(test.get(1)<test.get(0))
		{
			System.out.print("True");
			largerNum = test.get(0);
			test.set(0,test.get(1));
			test.set(1, largerNum);
		}
		//print out updated list
		System.out.println("Updated:");
		for(int i = 0; i<test.size();i++)
		{
			System.out.print(test.get(i) + " ");
		}
		
	}
}
