/* Name:Jake Coombes
 * Date:10/30/18
 * Description:
 * 		create the MainClass as described in lab 7
 */

package lab7part1;

public class MainClass {

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		
		//create an instance of the runningTotal class
		RunningTotal total = new RunningTotal();
		
		//create a running total
		total.getNumbersFromUser();
				
		//print out product, sum, and average from the total
		System.out.println("\nthe Product is: " + total.getProduct());
		System.out.println("the Sum is: " + total.getSum());
		System.out.println("the average is: " + total.getAverage());
	}

}
