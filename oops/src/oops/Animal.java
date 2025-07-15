package oops;

public class Animal {
	void eat() {
		System.out.println("Eat");
	}
	void sleep() {
		System.out.println("Sleep");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Eat");
	}
	void sleep() {
		System.out.println("Sleep");
	}
	void fly() {
		System.out.println("Fly");
	}
}
 class Myclass {
	 public static void main(String[] args) {
		 Animal animal = new Animal();
		 animal.eat();
		 animal.sleep();
		 Bird bird = new Bird();
		 bird.eat();
		 bird.sleep();
		 bird.fly();
		 
	 }
	
}