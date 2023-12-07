//3)vowel and consonant


import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a character: ");
	char ch = scanner.next().charAt(0);

	switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
	 System.out.println(ch + "is a Vowel.");
	 break;
	default:
            System.out.println(ch + "is a Consonant."); 
}
     
	
             
        }
    }
	
	


