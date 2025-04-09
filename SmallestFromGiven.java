import java.util.Scanner;

public class SmallestFromGiven {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int i = 1, small = 10;//any number entered by the user will be smaller than this initial value
		
		while (i <= 10) {
			System.out.println("Enter the numbers" + i);
			int n = s.nextInt();
			if (n < small) {
				small = n;
			}
			
			i++;
		}
		System.out.println("the smallest among the numbers: " + small);
	}

}

