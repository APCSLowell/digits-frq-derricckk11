import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;
	

	public Digits(int num)
	{ /* to be implemented in part (a) */ 

		digitList = new ArrayList<Integer>();
		digitList.add(0, new Integer(num % 10));
		
		int temp = num / 10; 
		
		while(temp > 0){

			digitList.add(0, new Integer(temp % 10));
			temp = temp / 10; 
		}
		
	    
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */

		for(int i = 0; i < digitList.size() -1){

			if(digitList.get(i).compareTo(digitList.get(i + 1)) >= 0){

				return false; 
				
			}
			
		}

		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
