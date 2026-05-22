package jump2java;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("결과 = "+result);
		
	}

}
