//5)

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
        int noOfBooks;
	int priceOfEachBook;
	double price, discountedPrice;
	char member;

        System.out.print(" Enter the price of one books : ");
        priceOfEachBook = sc.nextInt();

	System.out.print(" Enter the no of books : ");
        noOfBooks = sc.nextInt();

	System.out.print(" Are you a member(Y/N) : ");
        member = sc.next().charAt(0);
	price = noOfBooks * priceOfEachBook ;
	if ( noOfBooks > 5 && noOfBooks < 10) {

	if ( member == 'Y' ) {
		discountedPrice = price - ((0.1 * price )+(0.05 * price));
		System.out.print(" final price : "+ discountedPrice);

	} else {
		discountedPrice = price;
		System.out.print(" final price : "+ discountedPrice);

	}
}
 if ( noOfBooks >= 10 ) {
	if ( member == 'Y' ) {
		discountedPrice = price - ((0.1 * price)+100);
		System.out.print(" final price : "+ discountedPrice);
}
}		
        
       

        
     
	
             
        }
    }
	
	


