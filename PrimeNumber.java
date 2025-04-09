import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		s.close();
		for(int i=1;i<=n;i++)
		{
			if (n%i==0)
				System.out.println("not prime" +n);

		}
		System.out.println("yes prime" +n);
	}

}
/*import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        s.close();

        int count = 0; // To count the number of divisors

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
*/


