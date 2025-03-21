package oops;
class book{
	int bookId;
	String title;
	String author;
	double price;
	book(int bookId,String title,String author, int price){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	

void displayDetails() {
	System.out.println("the bookId is:"+bookId);	
	
	System.out.println("the title is:"+title);	
	System.out.println("the author is:"+author);
	System.out.println("the price is:"+price);
}
	
}

public class task {
      public static void main(String[] args) {
    	  book b1=new book(129,"the murmur","shivani",300);
    	  b1.displayDetails();
      }
      
}

