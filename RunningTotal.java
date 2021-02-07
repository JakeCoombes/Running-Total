/* Name:Jake Coombes
 * Date:10/30/18
 * Description:
 * 		create the runningTotal class described in lab 7
 */

package lab7part1;

import java.util.*;

public class RunningTotal 
{
	Scanner input = new Scanner(System.in);
	//define variables 
	private double product=1.0;
	private double sum=0.0;
	private int totalNumbersEntered=0;
	private double num;
	
	//generate getters setters
	public void getNumbersFromUser() 
	{
		
				
		//get user input and enter it to the running total
		do 
		{
			System.out.println("Enter a Positive Number (negative to exit):");
			num = input.nextDouble();
				
			if(num>=0)
			{
				product*=num;
				sum+=num;
				totalNumbersEntered++;
			}
					
		}while(num>=0);
	}
	public double getProduct() {
		return product;
	}
	public double getSum() {
		return sum;
	}
	public double getAverage() {
		return (sum/totalNumbersEntered);
	}
	
}
