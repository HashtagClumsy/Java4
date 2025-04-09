import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter the given number " );
		int n= s.nextInt();
		
		while(n>0)
		{
			sum = sum+(n%10);
			System.out.println(sum );
			n = n/10;
			System.out.println(n );

		}
		System.out.println("Sum of digits: " + sum); // Print the sum of digits
        s.close();
	}

}
