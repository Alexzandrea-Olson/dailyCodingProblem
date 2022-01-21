package dailyCodingProblem2;

public class main {
	
 public static void main(String[] args) {
	 
	//variables
	int arrayOne[] = {10,15,3,7};
	int keyNum = 17;
	boolean temp = false;

	//creating second array to compare
	int arrayTwo[] = new int[arrayOne.length];
	
	//copying one array to the next array
	for(int i = 0; i < arrayOne.length; i++) {
		arrayTwo[i] = arrayOne[i];
	}
	
	//double looping through arrays comparing the first one to the second
	for(int i = 0; i < arrayOne.length; i++) {
		for(int j = 0; j < arrayTwo.length; j++) {
			
			//adding two numbers in the two different arrays together 
			int variable = 0;
			variable = arrayOne[i] + arrayTwo[j];
			
			//printing two numbers that equals keyNum and changing the boolean variable to true
			if(variable == keyNum) {
				temp = true;
				System.out.println(arrayOne[i] + " + " + arrayTwo[j] + " = " + keyNum);
				break;
			}
	 }
	}
	System.out.println("The temp variable is: " + temp);
 }
}
