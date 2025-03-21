package oops;
/*class Bike{
	String color;
	Bike(){
	color="blue";
	 
	}
	void display() {
		System.out.println("The bike color is "+color);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.display();
	}

}*/


class Bike{
	int count;
	String bikename;
	Bike(int count,String bikename){
		this.count =count ;
		this.bikename=bikename;
	}
	void display() {
		System.out.println("the bike count is:"+count);
		System.out.println("the bikename is:"+bikename);

		
	}
	public class Constructor{
	
	public static void main(String[] args) {
		Bike b1 = new Bike(2,"MT");
		b1.display();
	}
	}
	
}