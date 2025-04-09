
public class Tables1to10 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int j=1;j<=10;j++) {
				int p = i * j;
				System.out.println( i+ "*" +j+ "=" + p);
			}
         System.out.println(); // Print a blank line for readability

		}
	
	}

}
/* for(int i =1;i<=5;i++)
{
int fact = 1;
for(int j=i;j>=1;j--)
{
	fact   = fact*j;
}
sum = sum+fact;
System.out.println("   "  +i+"     " +fact);
}*/