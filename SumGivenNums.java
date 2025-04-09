import java.util.Scanner;

public class SumGivenNums {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1,n, sum = 0;
	
		while (i <= 3) {
			System.out.print("Enter the 3 number:" +i );
			n = s.nextInt();
			sum = sum + n;
			i++;
		}
		System.out.println("Sum = " + sum);

	}

}
