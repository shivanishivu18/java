package Stringoperations;
import java.util.*;
public class userinput {
public static void main(String args[]) {
	/*Scanner s1=new Scanner(System.in);
System.out.println("enter a name");
String name =s1.nextLine();
System.out.println(name);*/

//equal
	/*String str="Java programming";
	String str1 = "java";
	System.out.println(str==str1);
	System.out.println(str.equals(str1));*/
	
//charAT
			/*String str="JAVA";
			System.out.println(str.charAt(2));*/
	
//split
	/*String str="java,python,springBoot";
	String []Language=str.split(",");
	for(String s1:Language) {
		System.out.println(s1);
	}*/
	
//concatenate
	/*String str="java";
	String str1="programming";
			System.out.println("Concat String:"+str.concat(str1));*/
	
//trim
	/*String str="JAVA";
	System.out.println(str.length());
	String str1=str.trim();
	System.out.println(str1);
	System.out.println(str1.length());*/
	
//compareTo
	/*String str="java";
	String str1="java";
	System.out.println(str.compareTo(str1));*/
	
//contains
/*String str="java programming";
System.out.println(str.contains("java"));
System.out.println(str.contains("python"));*/

//string intern
	/*String s1=new String("JavaDevelopment");
	String s2="JavaDeveloper";
	String s3=s1.intern();
	System.out.println(s1==s2);
	System.out.println(s2==s3);*/
	
//replace	
	/*String str="Java programming";
	System.out.println(str.replace('a','A'));*/

//indexOf
	/*String str="Java Programming";
	System.out.println(str.indexOf("prog"));
	System.out.println(str.indexOf("X"));*/
	
//length	
	/*String str=" java ";
	System.out.println(str.length());*/
	
//substring
	/*String str="Java programming";
	System.out.println(str.substring(3));
	System.out.println(str.substring(0,4));*/
	
//toUpperCase and toLowerCase
	String str="Java programming";
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
}
}