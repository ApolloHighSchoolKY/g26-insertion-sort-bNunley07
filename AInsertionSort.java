import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

        int copy = 0;
        int loc = 0;
        for(int i = 1; i < myNumbers.length;i++){
            loc = i;

            while(myNumbers[loc] < myNumbers[loc-1] && loc>=0)
            {
                copy = myNumbers[loc-1];
                myNumbers[loc-1] = myNumbers[loc];
                myNumbers[loc] = copy;
                loc--;
            }

	    
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
