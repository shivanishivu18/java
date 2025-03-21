package oops;
import java.util.*;

public class method {
	public static int add(int a,int b) {
		return a+b;
	}
       public static void main(String[] args) {
    	   
    	   Scanner s1 = new Scanner(System.in);
    	   System.out.println("enter a value");
           int inp1 = s1.nextInt();
           int inp2 = s1.nextInt();
           System.out.println(add(inp1,inp2));

           
       }
} 


