package DynamicProgramming;
import java.util.*;
public class BottomUpApporach {

		public static void main(String[] args) {
			
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter the two number number1 and number2");
				int number1 = scanner.nextInt();			// store 1 input in number1
				int number2 = scanner.nextInt();			// store 1 input in number2
				
				System.out.println("Till where you want to See you Series");
				int destination = scanner.nextInt();		// taking the input that how much number in the series we want
				
				System.out.print(number1 + " " + number2 +" ");
				
				int arr[] = new int[destination];          //creating an array to store the numbers of a fibnocci series
				
				arr[0] = number1;							//first value of array is number1
				arr[1] = number2;							//second value of array is number2
				
				for(int ctr = 2; ctr < destination;ctr++) {   
					arr[ctr] = arr[ctr-1] + arr[ctr-2];    // adding the last two value of array and then store in next block of the array
					System.out.print(arr[ctr] + " ");      // printing above value
				}
			}
		}
	
}
