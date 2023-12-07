//1

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner scanner = new Scanner(System.in);
	String g;
        System.out.print("Enter the letter grade: ");
        g = scanner.nextLine();
   
        switch (g) {
            case "A":
                System.out.print("g = 4.0 ");
	break;
            case "B":
                System.out.print("g = 3.0 ");
	break;
            case "C":
               System.out.print("g = 2.0 ");
	break;
            case "D":
               System.out.print("g = 1.0 ");
	break;
            case "F":
                System.out.print("g = 0.0 ");
	break;
            default:

	 System.out.println("invalid grade");
             
        }
    }
}	
