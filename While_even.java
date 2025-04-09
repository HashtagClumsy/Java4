
public class While_even {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i);
			if (i < 100)
				System.out.print(",");
			}
			i++;
		}
	}

}
/*int i=1;
while (i <= 100)
{
	if (i % 2 == 0)
		System.out.print(i+" ");
	i++;
	 if (i % 2 == 0) {
                System.out.print(i); // Print the number
                if (i < 100) {       // Check if it's not the last even number
                    System.out.print(","); // Print a comma only if it's not the last number
                }
            }
            i++;
}*/
