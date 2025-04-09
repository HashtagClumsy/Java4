import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char ch = s.next().toLowerCase().charAt(0);
		if (Character.isAlphabetic(ch)) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
				break;

			}
		} else
			System.out.println("Given character is not an alphabet");

	}

}
/*
 * Scanner s = new Scanner(System.in); System.out.println("Enter a character");
 * char c = s.next().toLowerCase().charAt(0); if (Character.isAlphabetic(c)) {
 * switch (c) { case 'a': case 'e': case 'i': case 'o': case 'u':
 * System.out.println("Given character is a vowel");break; default:
 * System.out.println("Given character is a consonant"); } } else
 * System.out.println("Given character is not an alphabet"); }
 * 
 * }
 */