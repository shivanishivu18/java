package oops;
class Data1 {
	private String name;
	public String getName() {
		return name;
	}
	
public void setName(String name) {
	if(name!=null&&!name.isEmpty()) {
		this.name = name;
		
	}
	else {
		System.out.println("invalid name!");
	}
}
}

public class encapsulation {
	public static void main(String[] args) {
		Data1 s1=new Data1();
		s1.setName("shivani");
		System.out.println("student Name:"+s1.getName());
				
	}
}

