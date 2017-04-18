import java.util.*;
public class main 
{
	
	public static ArrayList<Integer> generateList(int n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)//iterates through list
		{
			list.add((int)(100*Math.random()));//generates 0-9
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
				if(returner.get(i)<returner.get(i-1))
				{
					largerNum = returner.get(i-1);
					returner.set(i-1,returner.get(i));
					returner.set(i, largerNum);
				}
			}
			
		}
		
		
		
		return returner;
	}
	
	
	public static void main(String[] args)
	{
	
		System.out.println("Welcome to Bubble Sort 1.0\n");
		//create list
		ArrayList<Integer> list = generateList(10);
		//print out list
		for(int i = 0; i < 10; i++)
		{
			if(i==9)
			{
				System.out.print(list.get(i)+"\n");
			}
			else
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println("\n\tSorted list:\n");
		//sort
		sort(list);
		//rePrint the list
		for(int i = 0; i < 10; i++)
		{
			if(i==9)
			{
				System.out.print(list.get(i)+"\n");
			}
			else
			System.out.print(list.get(i) + ", ");
		}
		
		
	}
}
