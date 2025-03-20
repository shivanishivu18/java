package Stringoperations;
import java.util.*;
public class Stringbuffer {
	public static void main(String agrs[]) {
	StringBuffer sb=new StringBuffer("Hello");
	//append
	sb.append("World");
	System.out.println("StringBuffer:"+sb);
	//insert
		sb.insert(5,",");
		System.out.println("StringBffer:"+sb);
		//replace
			sb.replace(6, 11,"java");
			System.out.println("StringBuffer:"+sb);
		//reverse
		sb.reverse();
		System.out.println("StringBuffer:"+sb);
}
}