
public class Typecasting {

	public static void main(String[] args) {
		//Implicit typecasting
		int n =100;
		long x =n;
		System.out.println(x);//100
		//explicit casting
		double d = 35.5;
		//short s = d;//error
		short s = (short)d;
		System.out.println(s);//35
	}

}
