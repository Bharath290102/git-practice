package NumbersProgram;

import java.util.Scanner;

public class PrimeNum1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the numbers ");
		int n = sc.nextInt();
		System.out.println("Print numbers between 1 and N");
		for (int i = 2; i <= n; i++) {
			boolean isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.print(i + " ");
			}

		}

	}

}
