
public class SumEvenSumOdd {

	public static void main(String[] args) {
		int  i = 1;
		int sumEven =0;
		int sumOdd = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				sumEven = sumEven+i;
				System.out.println("Sum of even numbers : " + sumEven);

			} else {
				
				sumOdd = sumOdd+i;
				System.out.println("Sum of odd numbers : " + sumOdd);
			}
			i++;
		}
		System.out.println("Final Sum of even numbers : " + sumEven);
		System.out.println("Final Sum of odd numbers : " + sumOdd);

	}

}
