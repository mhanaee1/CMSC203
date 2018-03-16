/**
 * 
 *constroctors for Amazon driver.
 * @author hamed
 */

import java.util.Scanner;
import java.util.*;
import java.lang.String;
public class Book {
    
	// declaring the variables
	private String title;
    private String author;
    private int amountOfRating;
    private int totalRating;
    private float price;
    private boolean hasHardCover;
   
    
    public Book(String title, String author){// a constructor for title and author
    	//getting all the information and setting them to their position 

        this.title = title;
        this .author = author;
        amountOfRating = 0;
        totalRating = 0;
        price = (float) (Math.random()*10);
        hasHardCover = false;

    }
  
    public Book (String title, String author, float price, boolean hasHardCover){ // a constructor for title and author, price and cover type
    	//getting all the information and setting them to their position 
        this.title = title;
        this .author = author;
        amountOfRating = 0;
        totalRating = 0;
        this.price = price;
        this.hasHardCover = hasHardCover;
    }
  
    public void addRating(int rating){
    	// saving the number of rating entered. and add them together
        totalRating += rating;
        amountOfRating ++;
        
    }
  
    public float findAvgRating() {
    // find the average of rating by deviding the total number of rating by the how many rating were entered.
        if (amountOfRating == 0)
            return 0;
        return ((float)totalRating)/amountOfRating;
    }
    
    public String bookRecommendation(){
    	
    	// recomendation for the book
        float avgRating = findAvgRating();
        if (avgRating>=3 && avgRating<=4)// if average of rating is between 3 and 4 including 3 and 4, say it is strongly recommended
            return "Strongly Recomended";
        if (avgRating >= 2 && avgRating <3)// if average of rating is between 2 and 3 including 2 and 3, say it is  recommended
            return "Recommended";
        else if (avgRating >=1 && avgRating<2)// if average of rating is between 1 and 2 including 1 and 2, say it is not recommended
            return "Not Recommended";
        else if (avgRating == 0)
            return "No Information Is Available For Recommendation";// if average of rating is 0 say this
        return "UNEXPECTED DATA FOUND";          
    }
  
   
    @Override
    public String toString(){
        return "Book title: " + title+ "\nBook author:" + author + "\nNumber of ratings: " + amountOfRating+ "\nAvg rating: " + findAvgRating() 
        + "\nPrice: " + price+ "\n" + bookRecommendation();
    }   
}