import java.util.Scanner;

public class q1309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 3;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] * 2 + dp[i-2];
			dp[i] = dp[i] % 9901;
		}
		System.out.println(dp[n]);
	}
}

/*
	N = 0 => 1
	N = 1 => 3 (=2x1+1)
	N = 2 => 7 (=2x3+1)
	N = 3 => 17 (=2x7+3)
	N = 4 => 41 (=2x17+7)
	
	Á¡È­½Ä : dp[i] = dp[i-1]*2 + dp[i-2]
*/