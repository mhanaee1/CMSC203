/**
 * this program will repeatedly ask for information of a new book, it will create an instance of the book
 * after that it will display to the user the gathered information, the application will then move to the next book without saving the entered book
 * the information that are gathered are , title, author, the average rating, hardcover or not, and price. 
 * @author hamed
 * 
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Amazon {

	public static Book getInput() {// getting information from class Book

		Book book1;
		// asking and getting title and author, and if there is more information for the book
        JOptionPane.showMessageDialog(null, "Welcome to Amazon book entry Aplication\n lets start entering book information ", "", JOptionPane.INFORMATION_MESSAGE);
        String title =JOptionPane.showInputDialog("Enter book title:");
        String author =JOptionPane.showInputDialog("Enter book author:");
        String choice =JOptionPane.showInputDialog("Do you want to add more information for the book, ex, price, type of cover...(y or n)");

        int rating = 0;
        if (choice.startsWith("y")){// if the is more information ask and get price and cover type
            String price =JOptionPane.showInputDialog("Enter the price Price:");
            String hasHardCover =JOptionPane.showInputDialog("Has hard cover yes or no?");
            book1 = new Book(title, author, Float.parseFloat(price), hasHardCover.equalsIgnoreCase("yes"));

        }
        else // if user said no to more information 
        book1 = new Book(title, author); 
            
        do {// get the rating for the book 
        rating =Integer.parseInt(JOptionPane.showInputDialog("add  rating 1-4 add 0 for no rating:"));
            if(rating>=1 && rating <= 4)// checking to make sure rating is between 1-4 including 1 and 4.
                book1.addRating(rating);
            else if (rating == 0) {// if rating is 0 exit
         	   
         	   return book1;
         	
             	} else {
                JOptionPane.showMessageDialog(null, "Invalid rating", "Error", JOptionPane.ERROR_MESSAGE);// if rating is not with in range display the error message and ask again for rating
        }
                    
} while (rating !=0);// if rating is 0 exit
        return book1;  

    }
    public static void main(String[] args) {
    	
    	String option;
    	do {	// using do while loop to keep application running until user says otherwise
    	
        JOptionPane.showMessageDialog(null, getInput().toString(), "details", JOptionPane.INFORMATION_MESSAGE);  
        
        option =JOptionPane.showInputDialog("Do you want to add more book...(y or n)");
    	}while(((String) option).equalsIgnoreCase("y"));
    }    
} 		
