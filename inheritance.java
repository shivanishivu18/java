package oops;
/*class Animal {
	void sound() {
	System.out.println("Animals make sounds");
	
}}
class Dog extends Animal{
	void barks() {
		System.out.println("dog barks");
	}
}

class cat extends Animal{
	void meow() {
		System.out.println("cat meow");
	}
	
}

public class inheritance {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		cat c1 = new cat();
		d1.barks();
		c1.meow();
		
		
	}

}*/



interface camera1{
void capturePhoto();
}
    interface musicplayer1{
	void playmusic();
}
class Smartphone implements camera1,musicplayer1{
	public void capturePhoto() {
		System.out.println("photo captured using the camera");
	}
	public void playmusic() {
		System.out.println("playing music");
	}

}
public class multi
