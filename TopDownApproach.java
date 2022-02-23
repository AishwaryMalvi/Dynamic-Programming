package DynamicProgramming;

public class TopDownApproach {

	public int fib (int[] memo ,int n) {
		if(memo[n] == 0) {
			if(n<2) {
				memo[n] = n;   // 0 and 1
			}
			else {
				int left = fib(memo,n-1);
				int right = fib(memo,n-1);
				memo[n] = left + right;
				
			}
		}
		return memo[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopDownApproach tda = new TopDownApproach();
		System.out.println(tda.fib(new int[6+1],6));
	}

}
