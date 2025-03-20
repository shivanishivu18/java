package day1programs;
import java.util.*;
public class controlstatement {
   public static void main(String srgs[]) {
	   //if statement
	   /*int a=10;
	   int b=20;
	   if(a<b) {
		   System.out.println("A Less than B");
	   }
	   else
	   {
		   System.out.println("B less than A");
	   }*/
   
      //Nested if
	/* int a=10;
	 int b=20;
	   if(a<b) {
	    if(a%2==0) 
	    {
		   System.out.println(a+"even number");
	   }
	  }*/
	   
	   //if else if statement
	   /* int a=300;
	    int b=300;
	    int c=3 00;
	    if(a>b && a>c)
	    {
	    	System.out.println("A is greater");
	    }
	    else if(b<a && b<c){
	    	System.out.println("Bis greater");
	    }
	    else if(c>a && c>b)
	    {
	    	System.out.println("c is greater");
	    }
	    els
	    {
	         System.out.println("All are equal");
	    }*/
	   
	   //switch statement
	   System.out.println("a");
	   System.out.println("b");
	   Scanner s1=new Scanner(System.in);
	   int a=s1.nextInt();
	   int b=s1.nextInt();
	   char choice;
	   System.out.println("+,_");
	   choice=s1.next().charAt(0);
	   switch(choice) {
	   case '+':
		   int c=a+b;
		   System.out.println("ADD"+c);
		   break;
	   case '-':
		   int d=a-b;
		   System.out.println("SUB"+d);
		   break;
		   default:
			   System.out.println("Invalid choice");
			   break;
			   
			   
	   }
	    
	 
	    
	   
	   
   }
}