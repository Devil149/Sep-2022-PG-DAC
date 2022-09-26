import java.util.*;
class Vowels
{
	public static void main(String args[])
	{
		Scanner vow = new Scanner(System.in);
		System.out.print("Enter a alphabet= ");
		char v= vow.next().charAt(0);
		String Vowel;		
		switch(v)
		{
			case ('a'):
			Vowel=("The given alphabet is a vowel: a");
			break;
			case 'e':
			Vowel=("The given alphabet is a vowel: e");
			break;
			case 'i':
			Vowel=("The given alphabet is a vowel: i");
			break;
			case 'o':
			Vowel=("The given alphabet is a vowel: o");
			break;
			case 'u':
			Vowel=("The given alphabet is a vowel: u");
			break;
			case 'A':
			Vowel=("The given alphabet is a vowel: A");
			break;
			case 'E':
			Vowel=("The given alphabet is a vowel: E");
			break;
			case 'I':
			Vowel=("The given alphabet is a vowel: I");
			break;
			case 'O':
			Vowel=("The given alphabet is a vowel: O");
			break;
			case 'U':
			Vowel=("The given alphabet is a vowel: U");
			break;			
			default:
			Vowel=("The given alphabet is not a vowel.");
		}
			System.out.println(Vowel);
		
	}
}