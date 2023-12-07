//2)movieticket

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	int age,time;
	double basePrice = 0.0;
       System.out.print("Enter the age : "); 
	age = sc.nextInt();
	 System.out.print("Enter the time : "); 
	time = sc.nextInt();

	 if (age <= 12) {
            basePrice = 5.00;
        } else if (age >= 12 && age < 60) {
            basePrice = 10.00;
        } else {
            basePrice = 7.50;
        } 
        if (time >= 15 && time <= 18) {
            
            basePrice = basePrice - 2.00;
        } if (time > 18) {
            
            basePrice = basePrice - 3.00;
    } 
	System.out.print("Final ticket price : " + basePrice );
             
        }
    }
	
	


