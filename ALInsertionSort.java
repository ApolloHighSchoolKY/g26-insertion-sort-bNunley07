 import java.util.ArrayList;
import java.util.Arrays;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;
		int loc = 0;
		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int i =1; i< myNumbers.length;i++)
		{
			inserted = false;
			loc = 0;

			while(inserted == false && loc < sorted.size())
			{
				if(myNumbers[i] <sorted.get(loc))
				{
					sorted.add(loc, myNumbers[i]);
					inserted =true;
				}
				loc++;
			}
		if(!inserted)
		{
			sorted.add(myNumbers[i]);
		}
	
		}
		for(int c =1; c< myNumbers.length;c++)
		{
			myNumbers[c] = sorted.get(c);
		}
		System.out.println(Arrays.toString(myNumbers));

    }


}
