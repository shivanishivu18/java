package oops;
import java.util.*;
class Hotel{
	String name ="pizza";
	int price = 200;
	int quantity = 1;
	  void display() {
		  
	  
	 System.out.println("your choice is:"+name);
	 System.out.println("price is:"+price);
	 System.out.println("quantity is:"+quantity);
	  }

}

public class classandobject {
     public static void main(String[] args) {
    	  
    	Hotel s1=new Hotel();
    	s1.quantity=1;
    	s1.display();
     }
}
